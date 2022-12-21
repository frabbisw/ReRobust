public void refreshData() {
    adapter.removeAll();
    progressBar.setVisibility(View.VISIBLE);
    startService();
    try {
        adapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
