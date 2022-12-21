public void removePepe() {
    try {
        updatePepes(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (pepes)--;
}
