@java.lang.Override
public void unloaded(java.lang.String nsURI, org.eclipse.emf.ecore.EPackage pak) {
    try {
        queryEnvironment.removeEPackage(pak.getNsPrefix());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
