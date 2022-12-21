public void initGoal(int x, int y) {
    Goal newGoal = new Goal();
    goals.add(newGoal);
    System.out.println("log");
    board[y][x].placeGoal(newGoal);
}
