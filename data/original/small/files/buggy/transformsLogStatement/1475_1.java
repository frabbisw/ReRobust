public void addMatchPerformance(int matchday, analyse.SpielPerformance matchPerformance) {
    System.out.println("log");
    matchPerformances.put(model.Mannschaft.getKey(matchday), matchPerformance);
}
