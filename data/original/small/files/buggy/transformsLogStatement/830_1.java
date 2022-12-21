public final void setChosen(boolean chosen) {
    System.out.println("log");
    if (chosen) {
        setScore(scoreIfChosen);
    } else {
        setScore(scoreIfUnchosen);
    }
    this.chosen = chosen;
}
