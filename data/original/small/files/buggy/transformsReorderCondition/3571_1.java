public boolean isClueUnanswered(final com.jam.jampardy.model.Clue clue) {
    return (com.jam.jampardy.model.GameBoard.Contestant.BLANK) == (answeredClueMap.get(clue));
}
