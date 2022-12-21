private void showUI(boolean show) {
    try {
        if (show) {
            add(panel);
        } else {
            java.lang.System.out.println("removing panel");
            remove(panel);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
