@java.lang.Override
public boolean canExtractItem(int slot, net.minecraft.item.ItemStack stack, int side) {
    try {
        java.lang.System.out.println(((stack.getItem()) instanceof cofh.api.energy.IEnergyContainerItem));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return slot == 1;
}
