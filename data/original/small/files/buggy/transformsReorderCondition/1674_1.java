public java.lang.Boolean imageFileExists() {
    if (0 < (paths.length)) {
        java.io.File imageFile = new java.io.File(paths[0]);
        return imageFile.exists();
    }
    return false;
}
