import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Wielowątkowy serwer obsługujący wielu klientów za pomocą gniazd.
 */
public class MultiThreadedServer {

    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serwer nasłuchuje na porcie " + port);

            while (true) {
                // Akceptowanie połączenia od klienta
                Socket clientSocket = serverSocket.accept();
                System.out.println("Połączono z klientem");

                // Tworzenie i uruchamianie nowego wątku dla każdego klienta
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Klasa obsługująca połączenie z klientem.
 */
class ClientHandler implements Runnable {

    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Otrzymano wiadomość od klienta: " + inputLine);
                out.println("Serwer otrzymał wiadomość: " + inputLine);

                if ("bye".equalsIgnoreCase(inputLine)) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
