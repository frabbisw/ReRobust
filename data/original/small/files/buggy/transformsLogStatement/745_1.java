public void addPoints(java.lang.Integer[] deltas) {
    System.out.println("log");
    if (deltas != null) {
        for (int delta : deltas) {
            addPoint(delta);
        }
    }
}
