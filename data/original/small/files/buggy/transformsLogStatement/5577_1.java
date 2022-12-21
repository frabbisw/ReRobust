public static void registerBlock(net.minecraft.block.Block block, net.minecraft.item.ItemBlock item) {
    ForgeRegistries.BLOCKS.register(block);
    System.out.println("log");
    net.minecraftforge.oredict.OreDictionary.registerOre("oreRedstone", block);
    item.setRegistryName(block.getRegistryName());
    ForgeRegistries.ITEMS.register(item);
}
