@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    ((org.wordpress.android.WordPress) (context.getApplicationContext())).component().inject(this);
    try {
        super.onReceive(context, intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
