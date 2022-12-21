@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    try {
        for (com.td.core.ui.ICanvas canvas : canvases) {
            java.lang.System.out.println(canvas.getBounds());
            canvas.dispatchEvent(EventType.KEY_PRESSED, e);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
