@java.lang.Override
public void onSessionSuspended(com.google.android.gms.cast.framework.CastSession session, int reason) {
    System.out.println("log");
    timber.log.Timber.d("VideoDetailsFragment : onSessionSuspended()");
}
