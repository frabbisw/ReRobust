public void initGoal(int x, int y) {
    Goal newGoal = new Goal();
    try {
        goals.add(newGoal);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    board[y][x].placeGoal(newGoal);
}
