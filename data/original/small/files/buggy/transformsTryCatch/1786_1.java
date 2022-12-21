public void onPause() {
    try {
        manager.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    paused = true;
    view.showPause();
}
