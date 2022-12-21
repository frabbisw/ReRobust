@java.lang.Override
public void run() {
    try {
        if ((progressCounter) > 0) {
            updateProgress((-1));
            handler.postDelayed(this, com.example.mjokic.quizapp.activities.ChallengeActivity.QUIZ_TICK);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
