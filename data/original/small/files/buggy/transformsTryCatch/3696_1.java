public void autoUpButton(android.app.ActionBar actionBar) {
    try {
        (this.actionBar = actionBar).setDisplayHomeAsUpEnabled(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
