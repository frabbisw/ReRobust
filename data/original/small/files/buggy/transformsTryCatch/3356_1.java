public void deleteMarkers() throws org.eclipse.core.runtime.CoreException {
    try {
        file.deleteMarkers(IRascalResources.ID_RASCAL_MARKER, false, IFile.DEPTH_ZERO);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
