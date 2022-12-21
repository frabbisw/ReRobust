private static boolean doesFilerExist(java.io.File file) {
    System.out.println("log");
    if (file == null)
        return false;
    return file.exists();
}
