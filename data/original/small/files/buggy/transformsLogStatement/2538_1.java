public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    registerEventListeners();
    registerPackets();
    System.out.println("log");
    BlockArmor.configFile = event.getSuggestedConfigurationFile();
    BlockArmor.logger = event.getModLog();
    twopiradians.blockArmor.common.tileentity.ModTileEntities.preInit();
}
