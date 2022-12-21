public void autoUpButton(android.app.ActionBar actionBar) {
    try {
        if (actionBar != null)
            (this.actionBar = actionBar).setDisplayHomeAsUpEnabled(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
