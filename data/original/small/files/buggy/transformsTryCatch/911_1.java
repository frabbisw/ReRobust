@java.lang.Override
public void highLightCorrect() {
    mController.saveQuizScore(quizTimerTextView.getText().toString());
    selectedChoice.setBackgroundColor(getResources().getColor(R.color.buttonColor));
    try {
        finishQuiz();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
