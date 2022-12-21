public void setValidatedPeptidesPerFraction(java.util.HashMap<java.lang.String, java.lang.Integer> validatedPeptidesPerFraction) {
    try {
        zooActivateWrite();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setModified(true);
    this.validatedPeptidesPerFraction = validatedPeptidesPerFraction;
}
