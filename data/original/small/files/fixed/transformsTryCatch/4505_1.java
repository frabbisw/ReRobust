private void showUI(boolean show) {
    try {
        if (show) {
            add(panel);
        } else {
            remove(panel);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
