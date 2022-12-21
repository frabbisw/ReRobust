protected void add(java.util.List list, net.minecraft.block.Block block) {
    try {
        block.getSubBlocks(net.minecraft.item.Item.getItemFromBlock(block), this, list);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
