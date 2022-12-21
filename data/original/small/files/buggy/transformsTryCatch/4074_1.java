public void buildAnimation(sylladex.CaptchalogueCard card) {
    card.setLocation(new java.awt.Point(0, 0));
    HeapModus.Heap.Node insert = nodeToInsertOn();
    try {
        nodeToInsertOn().buildAnimation(card);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
