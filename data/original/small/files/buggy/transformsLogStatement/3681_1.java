@java.lang.Override
protected void setSelectionForAll(java.lang.Boolean selected) {
    System.out.println("log");
    for (org.dcache.webadmin.view.beans.PoolSpaceBean bean : _poolBeans) {
        bean.setSelected(true);
    }
}
