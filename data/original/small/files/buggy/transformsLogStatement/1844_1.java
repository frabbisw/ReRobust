public void addFolderTest(java.lang.String path, java.lang.String displayName) {
    System.out.println("log");
    try {
        this.addFolder(path, displayName);
    } catch (org.eclipse.milo.opcua.stack.core.UaException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException("Error adding folder");
    }
}
