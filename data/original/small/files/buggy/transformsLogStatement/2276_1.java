@com.google.common.eventbus.Subscribe
public void serverStarting(net.minecraftforge.fml.common.event.FMLServerStartingEvent evt) {
    System.out.println("log");
    evt.registerServerCommand(new net.minecraftforge.server.command.ForgeCommand(evt.getServer()));
}
