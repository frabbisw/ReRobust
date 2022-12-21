public java.lang.Boolean imageFileExists() {
    try {
        if ((paths.length) > 0) {
            java.io.File imageFile = new java.io.File(paths[0]);
            return imageFile.exists();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
