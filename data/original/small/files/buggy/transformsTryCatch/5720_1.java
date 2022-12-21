protected java.lang.String getType(java.io.File file) {
    if (file.isDirectory()) {
        return "Folder";
    }
    java.lang.String extension = net.filebot.util.FileUtilities.FileUtilities.getExtension(file);
    try {
        if (extension != null) {
            return extension.toLowerCase();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "File";
}
