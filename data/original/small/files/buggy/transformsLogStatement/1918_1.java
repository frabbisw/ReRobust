@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlotOnClosing(int index) {
    System.out.println("log");
    net.minecraft.item.ItemStack stackInSlot = getStackInSlot(index);
    if (stackInSlot != null) {
        setInventorySlotContents(index, null);
        return stackInSlot;
    }
    return null;
}
