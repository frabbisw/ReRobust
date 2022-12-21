public void dealData() {
    recordHotSpot();
    dealColdData();
    try {
        currentHotSpotSet.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
