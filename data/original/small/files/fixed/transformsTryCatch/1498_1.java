@java.lang.Override
public void preInit() {
    try {
        net.minecraftforge.fml.common.registry.GameRegistry.registerBlock(this, org.squiddev.cctweaks.items.ItemMultiBlock.class, name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    registerTileEntity(org.squiddev.cctweaks.blocks.network.TileNetworkedWirelessBridge.class, "wirelessBridge");
    registerTileEntity(org.squiddev.cctweaks.blocks.network.TileNetworkedModem.class, "wiredModem");
}
