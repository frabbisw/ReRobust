@java.lang.Override
public void run() {
    try {
        action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, next);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((repeatIntervalMs) != (com.google.android.exoplayer2.C.TIME_UNSET)) {
        clock.postDelayed(mainHandler, this, repeatIntervalMs);
    }
}
