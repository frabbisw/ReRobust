public static void clear() {
    try {
        ru.casak.whiteboard.DrawView.canvasDraw.drawRGB(255, 255, 255);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ru.casak.whiteboard.DrawView.instance.invalidate();
}
