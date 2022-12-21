public static void evolve() {
    try {
        TSP.chromosomes = Evolution.Evolve(TSP.chromosomes, TSP.cities);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
