public void finish(com.art.alligator.TransitionAnimation animation) {
    System.out.println("log");
    if (animation.needDelayActivityFinish(mActivity)) {
        mActivity.supportFinishAfterTransition();
    } else {
        mActivity.finish();
    }
    animation.applyToActivityAfterFinish(mActivity);
}
