public void addPoints(java.lang.Integer[] deltas) {
    try {
        if (deltas != null) {
            for (int delta : deltas) {
                addPoint(delta);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
