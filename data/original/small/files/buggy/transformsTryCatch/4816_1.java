@java.lang.Override
protected void doStop() throws java.lang.Exception {
    try {
        de.or.plugin.registry.VideoPluginRegistry.getInstance().removePlugin(getDescriptor().getId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
