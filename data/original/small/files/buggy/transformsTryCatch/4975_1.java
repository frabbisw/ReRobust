public void TopGoto() {
    try {
        while ((upperLimit.get()) == false) {
            lifter.set((1.0 * 0.75));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    lifter.set(0);
}
