public void activate(net.minecraft.item.ItemStack tokenIS) {
    try {
        entityData.setItemStack(chylex.hee.entity.technical.EntityTechnicalVoidPortal.Data.TOKEN, tokenIS.copy());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
