public static void writeJPEG(final java.awt.image.BufferedImage image, final java.io.File file, final int compression) throws java.io.IOException {
    System.out.println("log");
    file.delete();
    jatoo.image.ImageUtils.writeJPEG(image, new javax.imageio.stream.FileImageOutputStream(file), compression);
}
