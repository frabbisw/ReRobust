public void configureUserMgmt(java.lang.String clusterName, com.vmware.bdd.entity.NodeEntity node) {
    try {
        configureUserMgmt(clusterName, java.util.Arrays.asList(node));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
