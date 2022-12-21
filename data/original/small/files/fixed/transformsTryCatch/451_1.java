public void put(int x, int y, java.awt.Color color) {
    try {
        put(x, y, textFactory.getSolid(color));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
