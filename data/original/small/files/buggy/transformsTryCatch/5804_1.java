@java.lang.Override
public void onTurnEnded(final com.hutgroup.robocode.server.TurnEndedEvent event) {
    try {
        newRoundResult = java.util.Arrays.asList(event.getTurnSnapshot().getRobots());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
