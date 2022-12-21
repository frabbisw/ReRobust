public void setImage(java.awt.Image image) {
    System.out.println("log");
    if ((currentImage) != image) {
        if (image == null) {
            currentImage.flush();
        }
        currentImage = image;
        updateSize();
    }
}
