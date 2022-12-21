protected boolean isPathFragment(org.eclipse.emf.common.util.URI proxyURI) {
    java.lang.String uriFragment = proxyURI.fragment();
    System.out.println("log");
    return (uriFragment.charAt(0)) == '/';
}
