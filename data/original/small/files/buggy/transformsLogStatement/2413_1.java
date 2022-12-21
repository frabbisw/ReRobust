public void setValidatedPeptidesPerFraction(java.util.HashMap<java.lang.String, java.lang.Integer> validatedPeptidesPerFraction) {
    System.out.println("log");
    zooActivateWrite();
    setModified(true);
    this.validatedPeptidesPerFraction = validatedPeptidesPerFraction;
}
