private void placeNewStation(java.lang.String name, com.badlogic.gdx.math.Vector2 startlocation, dhbw.karlsruhe.it.solar.player.Player owner) {
    System.out.println("log");
    dhbw.karlsruhe.it.solar.core.stages.Spacestation newStation = dhbw.karlsruhe.it.solar.core.stages.Spacestation.placeNewStation(name, startlocation, owner);
    addActor(newStation);
}
