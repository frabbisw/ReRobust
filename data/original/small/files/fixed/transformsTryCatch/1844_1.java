public void addFolderTest(java.lang.String path, java.lang.String displayName) throws org.eclipse.milo.opcua.stack.core.UaException {
    try {
        this.addFolder(path, displayName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
