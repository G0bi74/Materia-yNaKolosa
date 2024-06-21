public class Main {
    public static void main(String[] args) {
        try {
            // Przykładowy tekst
            String text = "Hello, World!";
            // Kodowanie tekstu do Base64
            String encodedText = encodeTextToBase64(text);
            System.out.println("Encoded Text: " + encodedText);
            // Dekodowanie tekstu z Base64
            String decodedText = decodeBase64ToText(encodedText);
            System.out.println("Decoded Text: " + decodedText);

            // Przykładowy obraz BufferedImage
            BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            image.getGraphics().fillRect(0, 0, 100, 100); // wypełniamy obraz białym kolorem
            // Kodowanie obrazu do Base64
            String encodedImage = encodeImageToBase64(image, "png");
            System.out.println("Encoded Image: " + encodedImage);
            // Dekodowanie obrazu z Base64
            BufferedImage decodedImage = decodeBase64ToImage(encodedImage);
            // Możemy np. zapisać zdekodowany obraz do pliku
            ImageIO.write(decodedImage, "png", new File("decoded_image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
