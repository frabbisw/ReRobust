private static void addBlock(net.minecraft.block.Block block, java.lang.String name) {
    tbsc.tbsccore.init.BlockInit.registeredBlocks.put(name, block);
    try {
        cpw.mods.fml.common.registry.GameRegistry.registerBlock(block, name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
