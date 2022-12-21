@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    for (; slot <= (mainInventory.size()); ) {
        mainInventory.add(null);
    }
    mainInventory.set(slot, stack);
}
