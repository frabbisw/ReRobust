public void setImage(java.awt.Image image) {
    try {
        if ((currentImage) != image) {
            if (image == null) {
                currentImage.flush();
            }
            currentImage = image;
            update();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
