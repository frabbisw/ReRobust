void visitFrom(int side) {
    walls[side] = 0;
    try {
        update();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
