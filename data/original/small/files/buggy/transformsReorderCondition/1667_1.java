public void setImage(java.awt.Image image) {
    if (image != (currentImage)) {
        if (image == null) {
            currentImage.flush();
        }
        currentImage = image;
        updateSize();
    }
}
