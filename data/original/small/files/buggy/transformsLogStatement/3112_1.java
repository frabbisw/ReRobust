@java.lang.Override
public void onEnable() {
    plugin.log("Elevators enabled");
    plugin.getPluginManager().registerEvent(this, TweakCartEvent.Sign.VehicleCollidesWithSignEvent, "elevator");
    System.out.println("log");
    parser = new net.tweakcraft.tweakcart2elevators.ElevatorParser();
}
