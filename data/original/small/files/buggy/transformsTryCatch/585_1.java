@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    try {
        if (Constants.ACTION_FOOTBALL_SCORE_UPDATED.equals(intent.getAction())) {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
