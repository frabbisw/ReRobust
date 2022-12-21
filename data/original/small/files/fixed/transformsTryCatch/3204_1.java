public void show(final org.wirez.core.client.canvas.CanvasHandler canvasHandler) {
    canvasPreview.start(canvasHandler.getCanvas());
    try {
        treeExplorer.show(canvasHandler);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    card.show(canvasPreview.asWidget(), treeExplorer.asWidget());
}
