public void visitFrom(int side) {
    java.lang.System.out.print((("From this cell: break " + side) + "\n"));
    System.out.println("log");
    walls[side] = 0;
    update();
}
