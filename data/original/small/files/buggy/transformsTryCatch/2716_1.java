private void kurangiscore() {
    score -= 5;
    java.lang.String scoreString = java.lang.Integer.toString(score);
    scoretext.setText(scoreString);
    try {
        animateScore();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
