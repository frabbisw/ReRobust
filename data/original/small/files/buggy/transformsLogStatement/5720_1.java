protected java.lang.String getType(java.io.File file) {
    if (file.isDirectory()) {
        return "Folder";
    }
    java.lang.String extension = net.filebot.util.FileUtilities.FileUtilities.getExtension(file);
    System.out.println("log");
    if (extension != null) {
        return extension.toLowerCase();
    }
    return "File";
}
