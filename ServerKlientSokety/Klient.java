import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Przykładowa implementacja klienta za pomocą gniazd.
 */
public class SimpleClient {

    public static void main(String[] args) {
        String hostName = "localhost"; // Adres serwera
        int port = 12345; // Numer portu serwera

        try (Socket socket = new Socket(hostName, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Połączono z serwerem");

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                // Wysyłanie wiadomości do serwera
                out.println(userInput);

                // Odbieranie odpowiedzi od serwera
                System.out.println("Odpowiedź z serwera: " + in.readLine());

                // Przerwanie pętli po wysłaniu wiadomości "bye"
                if ("bye".equalsIgnoreCase(userInput)) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
