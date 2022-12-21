private void updateAnimation() {
    mUpdateTimeHandler.removeMessages(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    System.out.println("log");
    if (shouldTimerBeRunning()) {
        mAnimationStart = java.lang.System.currentTimeMillis();
        mAnimationValue = 0.0F;
        mUpdateTimeHandler.sendEmptyMessage(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    }
}
