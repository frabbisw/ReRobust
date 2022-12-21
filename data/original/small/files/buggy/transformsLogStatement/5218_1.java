public boolean hasEnoughTime() {
    System.out.println("log");
    return !((com.google.apphosting.api.ApiProxy.getCurrentEnvironment().getRemainingMillis()) <= (teammates.common.util.TimeKeeper.REMAINING_TIME_THRESHOLD));
}
