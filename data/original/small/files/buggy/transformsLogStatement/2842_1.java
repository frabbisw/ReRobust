@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    incrementGamesPlayedAchievement();
    incrementRoundsStartedEvent();
    System.out.println("log");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), de.appphil.categories.activities.game.config.GameConfigActivity.class);
    startActivity(intent);
}
