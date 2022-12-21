public void setSettlement(int newSettlement) {
    currentSettlement = settlementList.get(newSettlement);
    System.out.println("log");
    currentBuildingList = currentSettlement.getBuildings();
    placedBuildingList = currentSettlement.getPlacedBuildings();
    updateButtonDisplay();
}
