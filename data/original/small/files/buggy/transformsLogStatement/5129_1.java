public static void clear() {
    System.out.println("log");
    ru.casak.whiteboard.DrawView.canvasDraw.drawRGB(255, 255, 255);
    ru.casak.whiteboard.DrawView.instance.invalidate();
}
