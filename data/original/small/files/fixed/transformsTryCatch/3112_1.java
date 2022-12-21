@java.lang.Override
public void onEnable() {
    try {
        plugin.getPluginManager().registerEvent(this, TweakCartEvent.Sign.VehicleCollidesWithSignEvent, "elevator");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    parser = new net.tweakcraft.tweakcart2elevators.ElevatorParser();
    plugin.log("Elevators enabled");
}
