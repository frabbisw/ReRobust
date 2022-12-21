@java.lang.Override
public void windowGainedFocus(java.awt.event.WindowEvent e) {
    java.lang.System.out.println("Our window got focus");
    System.out.println("log");
    studio_.getDisplayManager().raisedToTop(ourViewer);
}
