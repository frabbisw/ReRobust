public static void main(java.lang.String[] args) {
    System.out.println("log");
    HighScores hs = HighScoresParser.readHighScores("resources/highscores.txt");
    java.lang.System.out.println(hs.printHighScores());
}
