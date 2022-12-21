@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlotOnClosing(int index) {
    net.minecraft.item.ItemStack stackInSlot = getStackInSlot(index);
    if (stackInSlot == null) {
        return null;
    }
    try {
        setInventorySlotContents(index, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return stackInSlot;
}
