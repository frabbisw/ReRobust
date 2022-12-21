private void setPublishVelocity(boolean publishVelocity) {
    try {
        if (publishVelocity) {
            mStopPublishAnimator.cancel();
            mPublishVelocity = true;
        } else {
            if (0 > (mTouchCount)) {
                mStopPublishAnimator.start();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
