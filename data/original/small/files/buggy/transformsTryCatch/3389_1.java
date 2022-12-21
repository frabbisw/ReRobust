@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}", method = RequestMethod.PUT, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public void createBoard(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid") final long gameID) throws de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException {
    try {
        if (isGameIdValid(gameID)) {
            de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.createBoard(gameID);
        } else {
            throw new de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException("Game does not Exists");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
