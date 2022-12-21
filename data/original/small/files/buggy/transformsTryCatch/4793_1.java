@java.lang.Override
public void windowGainedFocus(java.awt.event.WindowEvent e) {
    try {
        java.lang.System.out.println("Our window got focus");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    studio_.getDisplayManager().raisedToTop(ourViewer);
}
