static void updateHeldBook(net.minecraft.server.v1_11_R1.PlayerInventory inventory) {
    try {
        inventory.setItem(inventory.itemInHandIndex, new net.minecraft.server.v1_11_R1.ItemStack(iieWelcomeKit.Book.setTag(inventory.getItem(inventory.itemInHandIndex).save(new net.minecraft.server.v1_11_R1.NBTTagCompound()))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
