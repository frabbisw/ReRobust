public static void registerBlock(net.minecraft.block.Block block, net.minecraft.item.ItemBlock item) {
    ForgeRegistries.BLOCKS.register(block);
    try {
        net.minecraftforge.oredict.OreDictionary.registerOre("oreRedstone", block);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    item.setRegistryName(block.getRegistryName());
    ForgeRegistries.ITEMS.register(item);
}
