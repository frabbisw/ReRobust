@java.lang.Override
public void run() {
    action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, next);
    if ((com.google.android.exoplayer2.C.TIME_UNSET) != (repeatIntervalMs)) {
        clock.postDelayed(mainHandler, this, repeatIntervalMs);
    }
}
