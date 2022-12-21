@java.lang.Override
public void run() {
    if (0 <= (progressCounter)) {
        updateProgress((-1));
        handler.postDelayed(this, com.example.mjokic.quizapp.activities.ChallengeActivity.QUIZ_TICK);
    } else {
        handler.removeCallbacks(this);
        finishQuiz();
    }
}
