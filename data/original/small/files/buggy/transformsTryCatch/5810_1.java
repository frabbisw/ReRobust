@javafx.fxml.FXML
void onSendToServerButtonClicked() {
    try {
        this.fleetSetupButton.setDisable(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.socketClient.sendStringToServer(this.game.getShipPlacementForServer());
    this.game.buildOpponentsBoard(new com.spanish_inquisition.battleship.client.board.boardcontroller.OpponentBoardController(new com.spanish_inquisition.battleship.client.board.GameBoard(this.opponentsGridPane)));
}
