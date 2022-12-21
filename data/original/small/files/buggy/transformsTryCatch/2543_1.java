private void updateListHeight(android.widget.ListView listView, com.medic.medicapp.WarningAdapter adapter) {
    try {
        adapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.medic.medicapp.UIUtils.setListViewHeightBasedOnItems(listView);
}
