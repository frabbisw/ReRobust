@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    incrementRoundsStartedEvent();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), de.appphil.categories.activities.game.config.GameConfigActivity.class);
    try {
        startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}