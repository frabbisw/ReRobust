public void setStateRevealed() {
    System.out.println("log");
    changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEALED);
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}
