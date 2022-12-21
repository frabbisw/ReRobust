public void showFab() {
    if ((android.view.View.GONE) == (getFab().getVisibility())) {
        getFab().show();
    }
    java.lang.System.out.println(getFab().getVisibility());
}
