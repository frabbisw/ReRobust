private void handleLoadMoreMsg() {
    footerViewLoading.setVisibility(View.GONE);
    footerViewLoadingVisible = false;
    isLoadingData = false;
    try {
        listViewAdapter.addData(updateItems);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    listViewAdapter.notifyDataSetChanged();
}
