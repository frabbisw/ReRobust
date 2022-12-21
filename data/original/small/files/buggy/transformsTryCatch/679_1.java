@java.lang.Override
public void onAnimationEnd() {
    try {
        if ((mIconComplete) != 0) {
            setIcon(mIconError);
        } else {
            setText(mErrorText);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mMorphingInProgress = false;
    mState = com.dd.CircularProgressButton.State.ERROR;
}
