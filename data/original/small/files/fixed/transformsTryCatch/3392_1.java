@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    mIsCheater = false;
    try {
        updateQuestion();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
