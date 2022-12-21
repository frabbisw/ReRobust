@java.lang.Override
public void onStart() {
    try {
        super.onStart();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(com.bignerdranch.android.geoquiz.QuizActivity.TAG, "onStart() called");
}
