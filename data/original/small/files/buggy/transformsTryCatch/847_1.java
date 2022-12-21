@java.lang.Override
protected void dropFewItems(boolean hitByPlayer, int lootingLvl) {
    try {
        if (SpiderCore.rand.nextBoolean()) {
            dropItem(net.minecraft.item.Item.getItemFromBlock(ModBlocks.stinger), 1.0F);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
