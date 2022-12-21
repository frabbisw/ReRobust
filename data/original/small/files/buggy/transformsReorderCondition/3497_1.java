private boolean isCarryingList() {
    net.minecraft.item.ItemStack stack = mc.thePlayer.inventory.getItemStack();
    return ((stack.getItem()) instanceof buildcraft.core.ItemList) && ((stack != null) && ((stack.getItem()) != null));
}
