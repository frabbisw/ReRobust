@javafx.fxml.FXML
void onSendToServerButtonClicked() {
    System.out.println("log");
    this.fleetSetupButton.setDisable(true);
    this.socketClient.sendStringToServer(this.game.getShipPlacementForServer());
    this.game.buildOpponentsBoard(new com.spanish_inquisition.battleship.client.board.boardcontroller.OpponentBoardController(new com.spanish_inquisition.battleship.client.board.GameBoard(this.opponentsGridPane)));
}
