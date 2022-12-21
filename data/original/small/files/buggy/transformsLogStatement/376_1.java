@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    System.out.println("log");
    ((org.wordpress.android.WordPress) (context.getApplicationContext())).component().inject(this);
}
