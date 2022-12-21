@java.lang.Override
public void unloaded(java.lang.String nsURI, org.eclipse.emf.ecore.EPackage pak) {
    System.out.println("log");
    queryEnvironment.removeEPackage(pak.getNsPrefix());
}
