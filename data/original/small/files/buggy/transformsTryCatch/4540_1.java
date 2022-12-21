@java.lang.Override
protected void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    changeToPauseFragment();
    isResumeAfterPause = true;
    gcs.sendGameEvent("game_pause", new java.lang.String[] {});
}
