@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    try {
        super.onReceive(context, intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ((org.wordpress.android.WordPress) (context.getApplicationContext())).component().inject(this);
}
