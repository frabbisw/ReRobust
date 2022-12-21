public static boolean createDirFileWithoutFileName(java.lang.String path) {
    java.io.File dir = new java.io.File(path);
    try {
        if (!(dir.exists())) {
            return dir.mkdirs();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
