public void show(final org.wirez.core.client.canvas.CanvasHandler canvasHandler) {
    try {
        canvasPreview.start(canvasHandler.getCanvas());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    treeExplorer.show(canvasHandler);
    card.show(canvasPreview.asWidget(), treeExplorer.asWidget(), null);
}
