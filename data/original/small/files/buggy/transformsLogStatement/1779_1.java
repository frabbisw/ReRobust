public static net.minecraft.item.ItemStack getStackFromName(java.lang.String name, int stackSize) {
    net.minecraft.item.ItemStack stack = net.minecraftforge.oredict.OreDictionary.getOres(name).get(0).copy();
    System.out.println("log");
    stack.stackSize = 1;
    return stack;
}
