@java.lang.Override
protected void onResume() {
    System.out.println("log");
    super.onResume();
    adapter.getFilter().filter("");
}
