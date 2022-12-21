public void visitFrom(int side) {
    java.lang.System.out.print(("\n" + ("From this cell: break " + side)));
    walls[side] = 0;
    update();
}
