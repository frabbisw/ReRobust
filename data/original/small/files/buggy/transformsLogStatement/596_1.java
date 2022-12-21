protected void add(java.util.List list, net.minecraft.block.Block block) {
    System.out.println("log");
    block.getSubBlocks(net.minecraft.item.Item.getItemFromBlock(block), this, list);
}
