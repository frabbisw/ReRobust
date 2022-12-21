public void setStateRevealed() {
    try {
        if (changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEALED)) {
            android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
