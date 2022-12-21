private void deactivateView(android.view.View parent) {
    try {
        for (android.view.View foo : parent.getTouchables()) {
            foo.setClickable(false);
            foo.setEnabled(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    parent.setEnabled(false);
}
