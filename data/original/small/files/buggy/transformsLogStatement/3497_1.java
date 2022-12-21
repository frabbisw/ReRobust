private boolean isCarryingList() {
    net.minecraft.item.ItemStack stack = mc.thePlayer.inventory.getItemStack();
    System.out.println("log");
    return ((stack != null) && ((stack.getItem()) != null)) && ((stack.getItem()) instanceof buildcraft.core.ItemList);
}
