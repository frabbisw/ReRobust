private org.eclipse.emf.ecore.EObject getEObject() {
    try {
        if ((fDiff) instanceof org.eclipse.emf.compare.diagram.internal.extensions.DiagramDiff) {
            return ((org.eclipse.emf.compare.diagram.internal.extensions.DiagramDiff) (fDiff)).getView();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
