public void add(java.lang.String imagePath, int imageNumber) {
    try {
        images.add(new org.youscope.plugin.measurementviewer.ImageList.ImageEntry(imageNumber, imagePath));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
