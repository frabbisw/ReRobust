private static void toast(android.content.Context context, final java.lang.String message, final int length) {
    System.out.println("log");
    android.widget.Toast.makeText(context, message, length).show();
}
