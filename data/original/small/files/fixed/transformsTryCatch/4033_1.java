public void enterScope() {
    hash = new java.util.Hashtable<java.lang.String, java.lang.Object>();
    try {
        scopes.add(hash);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
