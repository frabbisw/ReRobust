@java.lang.Override
protected void doStop() throws java.lang.Exception {
    try {
        de.or.plugin.registry.VideoPluginRegistry.getInstance().removePlugin(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
