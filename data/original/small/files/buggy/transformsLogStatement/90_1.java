private void setPlayButtonIcon() {
    System.out.println("log");
    if ((stopwatchState.isRunning()) && ((playButton) != null))
        playButton.setImageResource(android.R.drawable.ic_media_pause);
    else
        playButton.setImageResource(android.R.drawable.ic_media_play);
}
