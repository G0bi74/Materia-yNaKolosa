/**
 * Metoda dekodująca ciąg Base64 do BufferedImage.
 * @param base64String Ciąg Base64 do dekodowania.
 * @return Zdekodowany obraz BufferedImage.
 * @throws IOException Gdy wystąpi błąd podczas odczytu obrazu.
 */
public static BufferedImage decodeBase64ToImage(String base64String) throws IOException {
    // Przekształcamy ciąg Base64 do bajtów
    byte[] imageBytes = Base64.getDecoder().decode(base64String);
    // Tworzymy strumień wejściowy z bajtów
    ByteArrayInputStream inputStream = new ByteArrayInputStream(imageBytes);
    // Odczytujemy obraz z strumienia wejściowego
    BufferedImage image = ImageIO.read(inputStream);
    // Zwracamy obraz
    return image;
}
