@java.lang.Override
public void onTurnEnded(final com.hutgroup.robocode.server.TurnEndedEvent event) {
    System.out.println("log");
    newRoundResult = java.util.Arrays.asList(event.getTurnSnapshot().getRobots());
}
