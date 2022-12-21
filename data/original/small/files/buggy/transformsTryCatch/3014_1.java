@java.lang.Override
public void drawRectangle(int x, int y, int width, int height) {
    try {
        component.getGraphics().drawRect(x, y, width, height);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
