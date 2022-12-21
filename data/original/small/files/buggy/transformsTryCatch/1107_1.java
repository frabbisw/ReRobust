@java.lang.Override
public void onSessionSuspended(com.google.android.gms.cast.framework.CastSession session, int reason) {
    try {
        timber.log.Timber.d("VideoDetailsFragment : onSessionSuspended()");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
