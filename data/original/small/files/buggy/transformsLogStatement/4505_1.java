private void showUI(boolean show) {
    System.out.println("log");
    if (show) {
        add(panel);
    } else {
        java.lang.System.out.println("removing panel");
        remove(panel);
    }
}
