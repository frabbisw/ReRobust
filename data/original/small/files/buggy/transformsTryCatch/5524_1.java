@java.lang.Override
public synchronized void onFailure(final java.lang.Throwable t) {
    try {
        be.appfoundry.promtius.ParallelPushAggregator.PusherAggregatorTaskCallback.LOGGER.debug("Push failure received", t);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (failureCount)++;
    markDelegateWhenFinished();
}
