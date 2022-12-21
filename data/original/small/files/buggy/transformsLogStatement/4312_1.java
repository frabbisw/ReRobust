@java.lang.Override
public void playRoadBuildingCard() {
    this.firstRoadPlaced = false;
    this.secondRoadPlaced = false;
    System.out.println("log");
    this.startMove(PieceType.ROAD, true, false);
}
