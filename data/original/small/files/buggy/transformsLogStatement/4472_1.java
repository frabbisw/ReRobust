protected void setListView() {
    System.out.println("log");
    fr.smartapps.smalistview.SMAListView listView = ((fr.smartapps.smalistview.SMAListView) (findViewById(R.id.list)));
    listView.initData(1, getDataViews(), this);
}
