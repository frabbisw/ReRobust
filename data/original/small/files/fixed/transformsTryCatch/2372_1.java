public static void openFile(android.content.Context context, java.io.File file) {
    try {
        com.frostwire.android.gui.util.UIUtils.openFile(context, file.getAbsolutePath(), com.frostwire.android.gui.util.UIUtils.getMimeType(file.getAbsolutePath()), true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
