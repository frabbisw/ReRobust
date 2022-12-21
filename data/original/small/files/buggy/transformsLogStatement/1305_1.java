public boolean getScrollableTracksViewportWidth() {
    System.out.println("log");
    return ((((org.scilab.modules.scinotes.ScilabDocument) (getDocument())).getView()) instanceof org.scilab.modules.scinotes.ScilabView) && (!(edComponent.isSplited()));
}
