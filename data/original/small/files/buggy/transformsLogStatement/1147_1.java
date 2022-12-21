@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int slot) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    slot = getSlotFromIndex(index);
    System.out.println("log");
    return handler.getStackInSlot(slot);
}
