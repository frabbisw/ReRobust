@java.lang.Override
public void run() {
    System.out.println("log");
    if ((progressCounter) >= 0) {
        updateProgress((-1));
        handler.postDelayed(this, com.example.mjokic.quizapp.activities.ChallengeActivity.QUIZ_TICK);
    } else {
        handler.removeCallbacks(this);
        finishQuiz();
    }
}
