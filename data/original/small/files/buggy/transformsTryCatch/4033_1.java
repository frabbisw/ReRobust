public void enterScope() {
    java.lang.System.out.println("Entering scope:");
    hash = new java.util.Hashtable<java.lang.String, java.lang.Object>();
    try {
        scopes.add(hash);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(scopes);
}
