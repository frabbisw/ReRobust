public void onPause() {
    try {
        if ((manager) != null)
            manager.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    paused = true;
    view.showPause();
}
