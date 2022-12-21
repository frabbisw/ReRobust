public void setSettlement(int newSettlement) {
    currentSettlement = settlementList.get((newSettlement - 1));
    currentBuildingList = currentSettlement.getBuildings();
    try {
        placedBuildingList = currentSettlement.getPlacedBuildings();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateButtonDisplay();
}
