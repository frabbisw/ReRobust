@java.lang.Override
protected void setSelectionForAll(java.lang.Boolean selected) {
    System.out.println("log");
    for (org.dcache.webadmin.view.util.SelectableWrapper<org.dcache.webadmin.view.beans.ActiveTransfersBean> wrapper : _transfers) {
        wrapper.setSelected(true);
    }
}
