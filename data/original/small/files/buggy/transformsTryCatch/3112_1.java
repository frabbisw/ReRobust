@java.lang.Override
public void onEnable() {
    try {
        plugin.log("Elevators enabled");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    plugin.getPluginManager().registerEvent(this, TweakCartEvent.Sign.VehicleCollidesWithSignEvent, "elevator");
    parser = new net.tweakcraft.tweakcart2elevators.ElevatorParser();
}
