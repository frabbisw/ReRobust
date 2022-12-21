public void visitFrom(int side) {
    try {
        java.lang.System.out.print((("From this cell: break " + side) + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    walls[side] = 0;
    update();
}
