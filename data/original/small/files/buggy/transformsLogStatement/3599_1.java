@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    while (slot <= (mainInventory.size())) {
        mainInventory.add(null);
    }
    System.out.println("log");
    mainInventory.set(slot, stack);
}
