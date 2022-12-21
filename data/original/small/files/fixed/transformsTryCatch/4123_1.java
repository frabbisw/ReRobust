@java.lang.Override
public void run() {
    action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, null);
    try {
        clock.postDelayed(mainHandler, this, repeatIntervalMs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
