public boolean isClueUnanswered(final com.jam.jampardy.model.Clue clue) {
    System.out.println("log");
    return (answeredClueMap.get(clue)) == (com.jam.jampardy.model.GameBoard.Contestant.BLANK);
}
