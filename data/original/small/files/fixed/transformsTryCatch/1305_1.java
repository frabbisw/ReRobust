public boolean getScrollableTracksViewportWidth() {
    try {
        if ((((org.scilab.modules.scinotes.ScilabDocument) (getDocument())).getView()) instanceof org.scilab.modules.scinotes.ScilabView) {
            return !(edComponent.isSplited());
        } else {
            return super.getScrollableTracksViewportWidth();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
