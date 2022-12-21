@java.lang.Override
protected void setSelectionForAll(java.lang.Boolean selected) {
    try {
        for (org.dcache.webadmin.view.beans.PoolSpaceBean bean : _poolBeans) {
            bean.setSelected(selected);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
