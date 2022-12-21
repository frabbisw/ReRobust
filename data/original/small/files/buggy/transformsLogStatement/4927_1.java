private void setPublishVelocity(boolean publishVelocity) {
    System.out.println("log");
    if (publishVelocity) {
        mStopPublishAnimator.cancel();
        mPublishVelocity = true;
    } else {
        if (0 > (mTouchCount)) {
            mStopPublishAnimator.start();
        }
    }
}
