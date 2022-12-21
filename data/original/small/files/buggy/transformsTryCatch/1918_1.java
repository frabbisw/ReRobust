@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlotOnClosing(int index) {
    net.minecraft.item.ItemStack stackInSlot = getStackInSlot(index);
    try {
        if (stackInSlot != null) {
            setInventorySlotContents(index, null);
            return stackInSlot;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
