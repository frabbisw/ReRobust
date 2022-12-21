protected void setListView() {
    fr.smartapps.smalistview.SMAListView listView = ((fr.smartapps.smalistview.SMAListView) (findViewById(R.id.list)));
    try {
        listView.initData(2, getDataViews(), this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
