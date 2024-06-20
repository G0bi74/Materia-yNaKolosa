import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    /**
     * Metoda do odczytu zawartości pliku tekstowego.
     * @param filePath Ścieżka do pliku do odczytu
     * @return Lista zawierająca linie tekstu z pliku
     * @throws IOException Błąd odczytu pliku
     */
    public List<String> readFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines;
    }

    /**
     * Metoda do zapisu danych do pliku tekstowego.
     * @param lines Lista linii tekstu do zapisania
     * @param filePath Ścieżka do pliku do zapisu
     * @throws IOException Błąd zapisu do pliku
     */
    public void writeToFile(List<String> lines, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    /**
     * Metoda do modyfikacji zawartości pliku tekstowego.
     * Zastępuje określoną linię nową zawartością.
     * @param filePath Ścieżka do pliku do modyfikacji
     * @param lineNumber Numer linii do zastąpienia (liczone od zera)
     * @param newContent Nowa zawartość linii
     * @throws IOException Błąd modyfikacji pliku
     */
    public void modifyFile(String filePath, int lineNumber, String newContent) throws IOException {
        List<String> lines = readFromFile(filePath);

        if (lineNumber >= 0 && lineNumber < lines.size()) {
            lines.set(lineNumber, newContent); // Zastąpienie linii nową zawartością
            writeToFile(lines, filePath); // Zapis zmodyfikowanych danych z powrotem do pliku
        } else {
            System.out.println("Numer linii do modyfikacji jest niepoprawny.");
        }
    }

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        String filePath = "test.txt";

        // Przykład użycia odczytu z pliku
        try {
            List<String> lines = fileHandler.readFromFile(filePath);
            System.out.println("Zawartość pliku:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }

        // Przykład użycia zapisu do pliku
        List<String> newLines = new ArrayList<>();
        newLines.add("Nowa linia 1");
        newLines.add("Nowa linia 2");
        try {
            fileHandler.writeToFile(newLines, filePath);
            System.out.println("Dane zostały zapisane do pliku.");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }

        // Przykład użycia modyfikacji pliku
        try {
            fileHandler.modifyFile(filePath, 0, "Zmodyfikowana pierwsza linia");
            System.out.println("Pierwsza linia została zmodyfikowana.");
        } catch (IOException e) {
            System.out.println("Błąd modyfikacji pliku: " + e.getMessage());
        }
    }

}
