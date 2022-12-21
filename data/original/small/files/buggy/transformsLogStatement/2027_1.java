private javax.swing.ImageIcon getScaledImage(java.awt.image.BufferedImage bufferedImage) {
    System.out.println("log");
    return new javax.swing.ImageIcon(bufferedImage.getScaledInstance(imageDimension.width, imageDimension.height, java.awt.Image.SCALE_SMOOTH));
}
