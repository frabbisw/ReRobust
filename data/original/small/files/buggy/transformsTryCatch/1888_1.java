private double getCostOfRoute() {
    double finalCost = 0;
    try {
        for (main.logic.Route r : getBestRoute()) {
            finalCost += cost(r);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return finalCost;
}
