private double calculateOverallQualityMeasure(java.lang.Integer numsentence) {
    double qm = 100 * (1 - ((numDefectiveSentences.doubleValue()) / (numsentence.doubleValue())));
    double qualityMeasure = java.lang.Math.abs(qm);
    return qualityMeasure;
}
