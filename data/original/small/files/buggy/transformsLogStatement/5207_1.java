private org.eclipse.emf.ecore.EObject getEObject() {
    if ((fDiff) instanceof org.eclipse.emf.compare.diagram.internal.extensions.DiagramDiff) {
        return ((org.eclipse.emf.compare.diagram.internal.extensions.DiagramDiff) (fDiff)).getView();
    }
    System.out.println("log");
    return null;
}
