@com.google.common.eventbus.Subscribe
public void serverStarting(net.minecraftforge.fml.common.event.FMLServerStartingEvent evt) {
    try {
        evt.registerServerCommand(new net.minecraftforge.server.command.ForgeCommand(evt.getServer()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
