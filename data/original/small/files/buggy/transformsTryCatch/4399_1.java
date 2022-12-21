private void handleLoadMoreMsg() {
    footerViewLoading.setVisibility(View.GONE);
    try {
        adviceListView.setFooterDividersEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    footerViewLoadingVisible = false;
    isLoadingData = false;
    listViewAdapter.addData(updateItems);
    listViewAdapter.notifyDataSetChanged();
}
