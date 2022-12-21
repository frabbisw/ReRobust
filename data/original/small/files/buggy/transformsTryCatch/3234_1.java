public void simplify() {
    try {
        if (this.root.simplify()) {
            this.fitness = java.lang.Double.MAX_VALUE;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
