public boolean hasEnoughTime() {
    return !((teammates.common.util.TimeKeeper.REMAINING_TIME_THRESHOLD) >= (com.google.apphosting.api.ApiProxy.getCurrentEnvironment().getRemainingMillis()));
}
