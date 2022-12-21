public void showFab() {
    System.out.println("log");
    if ((getFab().getVisibility()) == (android.view.View.GONE)) {
        getFab().show();
    }
    java.lang.System.out.println(getFab().getVisibility());
}
