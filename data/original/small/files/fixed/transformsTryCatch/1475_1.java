public void addMatchPerformance(int matchday, analyse.SpielPerformance matchPerformance) {
    try {
        if (matchPerformance == null)
            matchPerformances.remove(model.Mannschaft.getKey(matchday));
        else
            matchPerformances.put(model.Mannschaft.getKey(matchday), matchPerformance);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
