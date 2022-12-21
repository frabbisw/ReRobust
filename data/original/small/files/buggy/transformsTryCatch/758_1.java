@net.minecraftforge.fml.common.Mod.EventHandler
public void load(net.minecraftforge.fml.common.event.FMLInitializationEvent evt) {
    MinecraftForge.EVENT_BUS.register(com.irtimaled.bbor.forge.ForgeMod.proxy);
    try {
        net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(com.irtimaled.bbor.forge.ForgeMod.proxy);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.irtimaled.bbor.forge.ForgeMod.proxy.init(configManager);
}
