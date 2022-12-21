private void kurangiscore() {
    score -= 5;
    java.lang.String scoreString = java.lang.Integer.toString(score);
    scoretext.setText(scoreString);
    System.out.println("log");
    animateScore();
}
