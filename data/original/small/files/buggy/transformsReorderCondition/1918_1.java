@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlotOnClosing(int index) {
    net.minecraft.item.ItemStack stackInSlot = getStackInSlot(index);
    if (null != stackInSlot) {
        setInventorySlotContents(index, null);
        return stackInSlot;
    }
    return null;
}
