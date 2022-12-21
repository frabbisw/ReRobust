private void updateListHeight(android.widget.ListView listView, com.medic.medicapp.WarningAdapter adapter) {
    adapter.notifyDataSetChanged();
    System.out.println("log");
    com.medic.medicapp.UIUtils.setListViewHeightBasedOnItems(listView);
}
