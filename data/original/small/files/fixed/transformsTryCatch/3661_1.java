public void onClick(android.view.View view) {
    guess(view);
    try {
        switchQuestionAndAnswers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
