public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    registerEventListeners();
    try {
        registerPackets();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    BlockArmor.configFile = event.getSuggestedConfigurationFile();
    BlockArmor.logger = event.getModLog();
    twopiradians.blockArmor.common.tileentity.ModTileEntities.preInit();
}
