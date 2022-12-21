public void showFab() {
    try {
        if ((getFab().getVisibility()) == (android.view.View.GONE)) {
            getFab().show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(getFab().getVisibility());
}
