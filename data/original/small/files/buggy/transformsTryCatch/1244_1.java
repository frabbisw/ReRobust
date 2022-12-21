public void checkInMedia(Media m, LibraryDataBase ldb) {
    try {
        m.checkInMedia();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
