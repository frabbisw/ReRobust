public void finish(com.art.alligator.TransitionAnimation animation) {
    try {
        if (animation.needDelayActivityFinish(mActivity)) {
            mActivity.supportFinishAfterTransition();
        } else {
            mActivity.finish();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    animation.applyToActivityAfterFinish(mActivity);
}
