private boolean shouldUpdate(long lastUpdate) {
    long delta = (java.lang.System.currentTimeMillis()) - lastUpdate;
    return (lastUpdate == (com.bearenterprises.sofiatraffic.constants.Constants.SHARED_PREFERENCES_DEFAULT_LAST_UPDATE_TIME)) || (delta > (com.bearenterprises.sofiatraffic.constants.Constants.WEEK_IN_MILLISECONDS));
}
