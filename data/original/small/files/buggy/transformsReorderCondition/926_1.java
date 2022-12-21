public void onFragmentInvisible() {
    if (!(this.fragmentVisible)) {
        return;
    }
    this.fragmentVisible = false;
    if (null != (this.adapter)) {
        this.adapter.onPause();
    }
}
