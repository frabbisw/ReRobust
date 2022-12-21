public static void main(java.lang.String[] args) throws java.io.IOException {
    try {
        MazePuzzle.maze = MazePuzzle.generateMaze();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    NewGameMenu newGame = new NewGameMenu();
}
