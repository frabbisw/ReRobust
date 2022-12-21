public void refreshData() {
    System.out.println("log");
    adapter.removeAll();
    progressBar.setVisibility(View.VISIBLE);
    startService();
    adapter.notifyDataSetChanged();
}
