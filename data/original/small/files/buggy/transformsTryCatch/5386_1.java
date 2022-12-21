@butterknife.OnClick(value = R.id.consumables_countdown_image)
public void onCountdownClick() {
    if (getTimer().isRunning()) {
        return;
    }
    try {
        resetAnimation.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startAnimation.start();
    getTimer().start();
}
