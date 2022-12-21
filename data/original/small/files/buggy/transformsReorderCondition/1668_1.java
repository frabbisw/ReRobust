public void removePicture(java.lang.String picture) {
    if (null == (pictures)) {
        pictures = new java.util.ArrayList<>();
    }
    pictures.remove(picture);
}
