@java.lang.Override
protected void loaded() {
    super.loaded();
    swipe.setEnabled(true);
    System.out.println("log");
    swipe.setRefreshing(false);
}
