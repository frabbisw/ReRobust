public void put(int x, int y, squidpony.SColor color) {
    try {
        put(x, y, textFactory.getSolid(color));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
