@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int slot) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    try {
        slot = getSlotFromIndex(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return handler.getStackInSlot(slot);
}
