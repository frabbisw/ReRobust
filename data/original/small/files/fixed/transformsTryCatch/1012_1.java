public void onComplete() {
    try {
        dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
