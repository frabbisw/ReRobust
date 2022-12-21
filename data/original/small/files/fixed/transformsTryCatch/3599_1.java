@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    while (slot >= (mainInventory.size())) {
        mainInventory.add(null);
    }
    try {
        mainInventory.set(slot, stack);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
