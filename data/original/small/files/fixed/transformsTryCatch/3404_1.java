public void removePepe(android.view.View view) {
    try {
        updatePepes(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (pepes)--;
}
