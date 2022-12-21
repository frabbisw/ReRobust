public void show(final org.wirez.core.client.canvas.CanvasHandler canvasHandler) {
    System.out.println("log");
    canvasPreview.start(canvasHandler.getCanvas());
    treeExplorer.show(canvasHandler);
    card.show(canvasPreview.asWidget(), treeExplorer.asWidget(), null);
}
