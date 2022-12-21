private void setViewPrevious() {
    try {
        java.lang.System.out.println("Previous");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model.InventoryItem previousItem = viewList.pPrev();
    if (previousItem != null)
        tab.setView(viewList.pPrev());
}
