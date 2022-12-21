public static void openFile(android.content.Context context, java.io.File file) {
    System.out.println("log");
    com.frostwire.android.gui.util.UIUtils.openFile(context, file.getAbsolutePath(), com.frostwire.android.gui.util.UIUtils.getMimeType(file.getAbsolutePath()));
}
