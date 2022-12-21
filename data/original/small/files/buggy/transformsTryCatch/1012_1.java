public void onComplete() {
    try {
        fadeTimer.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dispose();
}
