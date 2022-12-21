public void deleteMarkers() throws org.eclipse.core.runtime.CoreException {
    System.out.println("log");
    file.deleteMarkers(IRascalResources.ID_RASCAL_MARKER, false, IFile.DEPTH_ZERO);
}
