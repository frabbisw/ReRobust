@java.lang.Override
public void run() {
    action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, next);
    System.out.println("log");
    if ((repeatIntervalMs) != (com.google.android.exoplayer2.C.TIME_UNSET)) {
        clock.postDelayed(mainHandler, this, repeatIntervalMs);
    }
}
