public void TopGoto() {
    while ((upperLimit.get()) == false) {
        lifter.set((1.0 * 1.0));
    }
    try {
        lifter.set(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
