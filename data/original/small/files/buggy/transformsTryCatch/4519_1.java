public ImageType getMainImage(java.lang.String objectNumber) {
    try {
        java.lang.System.out.println(mainImages.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mainImages.get(objectNumber);
}
