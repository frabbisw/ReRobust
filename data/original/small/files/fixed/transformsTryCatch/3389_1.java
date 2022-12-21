@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}", method = RequestMethod.PUT, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public void createBoard(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid") final long gameID) {
    try {
        de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.createBoard(gameID);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
