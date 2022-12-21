@java.lang.Override
public boolean canInsertItem(int slot, net.minecraft.item.ItemStack item, int side) {
    System.out.println("log");
    return isItemValidForSlot(slot, item);
}
