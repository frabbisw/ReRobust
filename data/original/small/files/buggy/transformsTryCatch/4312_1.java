@java.lang.Override
public void playRoadBuildingCard() {
    this.firstRoadPlaced = false;
    this.secondRoadPlaced = false;
    try {
        this.startMove(PieceType.ROAD, true, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
