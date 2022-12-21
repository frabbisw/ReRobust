public void stop(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    tern.eclipse.ide.ui.TernUIPlugin.plugin = null;
    System.out.println("log");
    super.stop(context);
    tern.eclipse.ide.ui.TernUIPlugin.getTernDescriptorManager().destroy();
}
