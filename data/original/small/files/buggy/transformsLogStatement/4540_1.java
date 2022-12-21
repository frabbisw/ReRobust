@java.lang.Override
protected void onPause() {
    super.onPause();
    changeToPauseFragment();
    isResumeAfterPause = true;
    System.out.println("log");
    gcs.sendGameEvent("game_pause", new java.lang.String[] {});
}
