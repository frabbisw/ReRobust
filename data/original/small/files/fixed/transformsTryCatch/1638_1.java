protected static void addBlock(net.minecraft.block.Block block, java.lang.String name) {
    try {
        tbsc.tbsccore.init.BlockInit.registeredBlocks.put(name, block);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cpw.mods.fml.common.registry.GameRegistry.registerBlock(block, name);
}
