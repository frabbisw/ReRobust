public void onFragmentInvisible() {
    System.out.println("log");
    if (!(this.fragmentVisible)) {
        return;
    }
    this.fragmentVisible = false;
    if ((this.adapter) != null) {
        this.adapter.onPause();
    }
}
