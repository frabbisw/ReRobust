public static void evolve() {
    try {
        Evolution.Evolve(TSP.chromosomes, TSP.cities);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
