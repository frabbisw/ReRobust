private void setViewPrevious() {
    java.lang.System.out.println("Previous");
    model.InventoryItem previousItem = viewList.pPrev();
    System.out.println("log");
    if (previousItem != null)
        tab.setView(viewList.pPrev());
}
