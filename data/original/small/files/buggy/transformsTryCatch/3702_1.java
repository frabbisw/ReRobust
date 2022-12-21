public void setStateRevealed() {
    try {
        changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEALED);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}
