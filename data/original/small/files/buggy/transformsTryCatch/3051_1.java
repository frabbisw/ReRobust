public static void deleteFile(java.io.File file) throws java.io.IOException {
    try {
        if ((file != null) & (file.exists())) {
            org.apache.commons.io.FileUtils.forceDelete(file);
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    throw new java.io.IOException("(Method deleteFileIfExist) file is null or not exist.");
}
