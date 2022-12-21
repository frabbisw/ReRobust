private static void keepFile(final java.io.File file) {
    final java.io.File n = new java.io.File(file.getParent(), (".keep" + (file.getName())));
    file.renameTo(n);
}
