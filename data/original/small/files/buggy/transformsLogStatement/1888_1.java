private double getCostOfRoute() {
    System.out.println("log");
    double finalCost = 0;
    for (main.logic.Route r : getBestRoute()) {
        finalCost += cost(r);
    }
    return finalCost;
}
