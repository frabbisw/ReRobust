public void put(int x, int y, squidpony.SColor color) {
    System.out.println("log");
    put(x, y, textFactory.getSolid(color));
}
