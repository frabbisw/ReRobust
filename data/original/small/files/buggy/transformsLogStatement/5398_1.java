private void deactivateView(android.view.View parent) {
    System.out.println("log");
    for (android.view.View foo : parent.getTouchables()) {
        foo.setClickable(false);
        foo.setEnabled(false);
    }
    parent.setEnabled(false);
}
