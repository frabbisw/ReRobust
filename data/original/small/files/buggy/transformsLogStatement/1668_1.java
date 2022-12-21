public void removePicture(java.lang.String picture) {
    if ((pictures) == null) {
        pictures = new java.util.ArrayList<>();
    }
    System.out.println("log");
    pictures.remove(picture);
}
