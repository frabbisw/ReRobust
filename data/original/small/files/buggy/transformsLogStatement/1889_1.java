public com.lost.blocks.ModelView.Block getBlock(short index) {
    System.out.println("log");
    return blocks[(index + (com.lost.blocks.ModelView.ColorIndexer.SHIFT))];
}
