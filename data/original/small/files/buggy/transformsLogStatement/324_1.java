protected void setListView() {
    System.out.println("log");
    fr.smartapps.smalistview.SMAListView listView = ((fr.smartapps.smalistview.SMAListView) (findViewById(R.id.list)));
    listView.initData(2, getDataViews(), this);
}
