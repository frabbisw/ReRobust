public static void deleteFile(java.io.File file) throws java.io.IOException {
    if ((null != file) & (file.exists())) {
        org.apache.commons.io.FileUtils.forceDelete(file);
        return;
    }
    throw new java.io.IOException("(Method deleteFileIfExist) file is null or not exist.");
}
