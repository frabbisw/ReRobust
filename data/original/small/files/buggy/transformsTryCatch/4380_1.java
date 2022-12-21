private void removeEverything() {
    marker1.remove();
    marker1 = null;
    try {
        marker2.remove();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    marker2 = null;
}
