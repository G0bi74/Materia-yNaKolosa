/**
 * Metoda dekodująca tekst z formatu Base64.
 * @param base64String Ciąg Base64 do dekodowania.
 * @return Zdekodowany tekst.
 */
public static String decodeBase64ToText(String base64String) {
    // Dekodujemy ciąg Base64 do bajtów
    byte[] textBytes = Base64.getDecoder().decode(base64String);
    // Przekształcamy bajty do tekstu w kodowaniu UTF-8
    String text = new String(textBytes, java.nio.charset.StandardCharsets.UTF_8);
    // Zwracamy tekst
    return text;
}
