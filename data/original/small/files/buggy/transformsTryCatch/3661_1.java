public void onClick(android.view.View v) {
    guess(v);
    try {
        switchQuestionAndAnswers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
