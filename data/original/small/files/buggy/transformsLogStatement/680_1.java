public void setConstraintsBounds(com.wwidesigner.optimization.Constraints constraints) throws java.lang.Exception {
    System.out.println("log");
    lowerBounds = constraints.getLowerBounds();
    upperBounds = constraints.getUpperBounds();
    validateBounds();
    setConstraints(constraints);
}
