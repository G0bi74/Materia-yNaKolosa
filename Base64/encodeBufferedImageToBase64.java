/**
 * Metoda kodująca BufferedImage do formatu Base64.
 * @param image Obraz BufferedImage do zakodowania.
 * @param format Format obrazu (np. "png").
 * @return Zakodowany ciąg Base64.
 * @throws IOException Gdy wystąpi błąd podczas zapisu obrazu.
 */
public static String encodeImageToBase64(BufferedImage image, String format) throws IOException {
    // Tworzymy strumień wyjściowy
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    // Zapisujemy obraz do strumienia wyjściowego w podanym formacie
    ImageIO.write(image, format, outputStream);
    // Przekształcamy zapisane bajty do ciągu Base64
    String base64String = Base64.getEncoder().encodeToString(outputStream.toByteArray());
    // Zwracamy ciąg Base64
    return base64String;
}
