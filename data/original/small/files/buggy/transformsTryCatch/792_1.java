public void initiateParVector(int numOfFeatures) {
    try {
        for (int i = 0; i < numOfFeatures; i++) {
            parVector.add((-0.5));
            rewardFunction.featureValues.add(new java.util.ArrayList<java.lang.Double>());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
