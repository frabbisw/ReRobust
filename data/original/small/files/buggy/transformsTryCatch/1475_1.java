public void addMatchPerformance(int matchday, analyse.SpielPerformance matchPerformance) {
    try {
        matchPerformances.put(model.Mannschaft.getKey(matchday), matchPerformance);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
