public void setSettlement(int newSettlement) {
    currentSettlement = settlementList.get(newSettlement);
    currentBuildingList = currentSettlement.getBuildings();
    try {
        placedBuildingList = currentSettlement.getPlacedBuildings();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateButtonDisplay();
}
