@java.lang.Override
protected void dropFewItems(boolean hitByPlayer, int lootingLvl) {
    System.out.println("log");
    if (SpiderCore.rand.nextBoolean()) {
        dropItem(net.minecraft.item.Item.getItemFromBlock(ModBlocks.stinger), 1.0F);
    }
}
