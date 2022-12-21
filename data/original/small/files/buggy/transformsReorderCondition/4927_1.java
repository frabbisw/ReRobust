private void setPublishVelocity(boolean publishVelocity) {
    if (publishVelocity) {
        mStopPublishAnimator.cancel();
        mPublishVelocity = true;
    } else {
        if ((mTouchCount) < 0) {
            mStopPublishAnimator.start();
        }
    }
}
