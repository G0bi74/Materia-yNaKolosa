/**
 * Metoda kodująca tekst do formatu Base64.
 * @param text Tekst do zakodowania.
 * @return Zakodowany ciąg Base64.
 */
public static String encodeTextToBase64(String text) {
    // Przekształcamy tekst do bajtów w kodowaniu UTF-8
    byte[] textBytes = text.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    // Kodujemy bajty do ciągu Base64
    String base64String = Base64.getEncoder().encodeToString(textBytes);
    // Zwracamy ciąg Base64
    return base64String;
}
