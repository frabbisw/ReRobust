private static boolean doesFilerExist(java.io.File file) {
    if (null == file)
        return false;
    return file.exists();
}
