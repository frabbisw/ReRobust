private void updateAnimation() {
    try {
        mUpdateTimeHandler.removeMessages(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (shouldTimerBeRunning()) {
        mAnimationStart = java.lang.System.currentTimeMillis();
        mAnimationValue = 0.0F;
        mUpdateTimeHandler.sendEmptyMessage(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    }
}
