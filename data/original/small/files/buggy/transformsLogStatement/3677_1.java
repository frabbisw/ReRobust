public static void write(final java.awt.image.BufferedImage image, final java.lang.String formatName, final java.io.File file) throws java.io.IOException {
    System.out.println("log");
    file.delete();
    javax.imageio.ImageIO.write(image, formatName, file);
}
