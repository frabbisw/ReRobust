public void handleGcmFailure(final java.lang.Throwable error) {
    try {
        this.sharedPreferences.edit().putBoolean(com.toshi.service.RegistrationIntentService.ETH_SERVICE_SENT_TOKEN_TO_SERVER, false).apply();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.toshi.util.LogUtil.exception(getClass(), "Error while registering gcm", error);
}
