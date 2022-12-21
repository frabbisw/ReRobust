public void removePicture(java.lang.String picture) {
    if ((pictures) == null) {
        pictures = new java.util.ArrayList<>();
    }
    try {
        pictures.remove(picture);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
