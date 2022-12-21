@java.lang.Override
protected void doStop() throws java.lang.Exception {
    System.out.println("log");
    de.or.plugin.registry.VideoPluginRegistry.getInstance().removePlugin(getDescriptor().getId());
}
