@java.lang.Override
public void onAnimationEnd() {
    if (0 != (mIconComplete)) {
        setIcon(mIconError);
    } else {
        setText(mErrorText);
    }
    mMorphingInProgress = false;
    mState = com.dd.CircularProgressButton.State.ERROR;
}
