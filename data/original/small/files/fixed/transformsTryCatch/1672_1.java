public void stop(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    tern.eclipse.ide.ui.TernUIPlugin.getTernDescriptorManager().destroy();
    tern.eclipse.ide.ui.TernUIPlugin.plugin = null;
    try {
        super.stop(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
