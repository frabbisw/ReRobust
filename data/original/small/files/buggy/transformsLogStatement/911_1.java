@java.lang.Override
public void highLightCorrect() {
    mController.saveQuizScore(quizTimerTextView.getText().toString());
    System.out.println("log");
    selectedChoice.setBackgroundColor(getResources().getColor(R.color.buttonColor));
    finishQuiz();
}
