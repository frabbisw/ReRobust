@java.lang.Override
protected void setSelectionForAll(java.lang.Boolean selected) {
    try {
        for (org.dcache.webadmin.view.util.SelectableWrapper<org.dcache.webadmin.view.beans.ActiveTransfersBean> wrapper : _transfers) {
            wrapper.setSelected(selected);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
