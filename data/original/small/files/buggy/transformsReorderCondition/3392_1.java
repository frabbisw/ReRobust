@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = (1 + (mCurrentIndex)) % (mQuestionBank.length);
    com.example.rahulchandrashekhar.geoquiz.HEAD mIsCheater = false;
    updateQuestion();
}
