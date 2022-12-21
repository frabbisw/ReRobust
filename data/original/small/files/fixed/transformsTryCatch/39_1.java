public static void main(java.lang.String[] args) {
    HighScores hs = HighScoresParser.readHighScores("resources/highscores.txt");
    try {
        java.lang.System.out.println(hs.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
