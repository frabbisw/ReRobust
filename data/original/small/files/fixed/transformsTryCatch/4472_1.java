protected void setListView() {
    fr.smartapps.smalistview.SMAListView listView = ((fr.smartapps.smalistview.SMAListView) (findViewById(R.id.list)));
    try {
        if (listView != null) {
            listView.initData(1, getDataViews(), this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
