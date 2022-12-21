private void removeEverything() {
    try {
        marker1.remove();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    marker1 = null;
    if ((line) != null) {
        line.remove();
    }
}
