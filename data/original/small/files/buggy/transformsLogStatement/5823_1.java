@java.lang.Override
public void onFinish() {
    System.out.println("log");
    uiElements.setCountDownText("00:00");
    android.content.Intent countDownIntent = new android.content.Intent(this, com.shapematchandroid.ui.ContinueScreenActivity.class);
    countDownIntent.putExtra(com.shapematchandroid.ui.GameScreenActivity.FINAL_SCORE, gameLogic.currentPoints());
    startActivity(countDownIntent);
}
