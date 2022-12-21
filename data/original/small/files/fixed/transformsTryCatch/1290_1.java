public void finish(com.art.alligator.TransitionAnimation animation) {
    if (animation.needDelayActivityFinish()) {
        mActivity.supportFinishAfterTransition();
    } else {
        mActivity.finish();
    }
    try {
        animation.applyToActivityAfterFinish(mActivity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
