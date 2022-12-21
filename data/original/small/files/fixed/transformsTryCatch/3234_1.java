public void simplify() {
    try {
        if (this.root.simplify()) {
            this.fitness = -1;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
