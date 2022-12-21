@java.lang.Override
public double getDurabilityForDisplay(net.minecraft.item.ItemStack stack) {
    System.out.println("log");
    return ((double) (this.getDurability(stack))) / ((double) (this.getMaxDurability(stack)));
}
