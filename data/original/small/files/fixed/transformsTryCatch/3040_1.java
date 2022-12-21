public static void toast(android.content.Context context, final java.lang.String message, final int length) {
    try {
        android.widget.Toast.makeText(context, message, length).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
