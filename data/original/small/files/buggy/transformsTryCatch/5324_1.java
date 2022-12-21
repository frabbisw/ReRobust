public void update(java.util.List<ciir.jfoley.chai.collections.Pair<java.lang.Boolean, java.lang.Double>> toEval, double cutoff) {
    try {
        for (ciir.jfoley.chai.collections.Pair<java.lang.Boolean, java.lang.Double> pred : toEval) {
            update(pred.left, ((pred.right) > cutoff));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
