private void updateListHeight(android.widget.ListView listView, com.medic.medicapp.WarningAdapter adapter) {
    com.medic.medicapp.UIUtils.setListViewHeightBasedOnItems(listView);
    try {
        adapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
