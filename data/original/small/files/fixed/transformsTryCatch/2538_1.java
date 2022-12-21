public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    registerPackets();
    BlockArmor.configFile = event.getSuggestedConfigurationFile();
    BlockArmor.logger = event.getModLog();
    try {
        twopiradians.blockArmor.common.tileentity.ModTileEntities.preInit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
