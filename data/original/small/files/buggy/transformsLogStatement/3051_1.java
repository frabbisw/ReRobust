public static void deleteFile(java.io.File file) throws java.io.IOException {
    System.out.println("log");
    if ((file != null) & (file.exists())) {
        org.apache.commons.io.FileUtils.forceDelete(file);
        return;
    }
    throw new java.io.IOException("(Method deleteFileIfExist) file is null or not exist.");
}
