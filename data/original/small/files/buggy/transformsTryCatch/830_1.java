public final void setChosen(boolean chosen) {
    try {
        if (chosen) {
            setScore(scoreIfChosen);
        } else {
            setScore(scoreIfUnchosen);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.chosen = chosen;
}
