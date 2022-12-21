public void setConstraintsBounds(com.wwidesigner.optimization.Constraints constraints) throws java.lang.Exception {
    lowerBounds = constraints.getLowerBounds();
    try {
        upperBounds = constraints.getUpperBounds();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    validateBounds();
    setConstraints(constraints);
}
