import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Przykładowa implementacja serwera za pomocą gniazd.
 */
public class SimpleServer {

    public static void main(String[] args) {
        int port = 12345; // Numer portu, na którym serwer będzie nasłuchiwał

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serwer nasłuchuje na porcie " + port);

            // Akceptowanie połączenia od klienta
            try (Socket clientSocket = serverSocket.accept();
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                System.out.println("Połączenie z klientem nawiązane");

                // Odczytanie wiadomości od klienta
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Otrzymano wiadomość od klienta: " + inputLine);
                    out.println("Serwer otrzymał wiadomość: " + inputLine);

                    // Przerwanie pętli po otrzymaniu wiadomości "bye"
                    if ("bye".equalsIgnoreCase(inputLine)) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
