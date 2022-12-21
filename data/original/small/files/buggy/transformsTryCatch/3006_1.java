public void dealData() {
    dealColdData();
    try {
        currentHotSpotSet.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    recordHotSpot();
}
