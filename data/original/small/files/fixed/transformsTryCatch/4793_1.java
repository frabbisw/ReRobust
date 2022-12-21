@java.lang.Override
public void windowGainedFocus(java.awt.event.WindowEvent e) {
    try {
        studio_.getDisplayManager().raisedToTop(ourViewer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
