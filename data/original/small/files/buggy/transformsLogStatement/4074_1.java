public void buildAnimation(sylladex.CaptchalogueCard card) {
    System.out.println("log");
    card.setLocation(new java.awt.Point(0, 0));
    HeapModus.Heap.Node insert = nodeToInsertOn();
    nodeToInsertOn().buildAnimation(card);
}
