@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    System.out.println("log");
    super.onReceive(context, intent);
    if (Constants.ACTION_FOOTBALL_SCORE_UPDATED.equals(intent.getAction())) {
    }
}
