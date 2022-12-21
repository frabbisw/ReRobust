public void onFragmentInvisible() {
    if (!(this.fragmentVisible)) {
        return;
    }
    this.fragmentVisible = false;
    try {
        if ((this.adapter) != null) {
            this.adapter.onPause();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
