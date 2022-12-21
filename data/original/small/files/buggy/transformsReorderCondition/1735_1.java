private void setViewPrevious() {
    java.lang.System.out.println("Previous");
    model.InventoryItem previousItem = viewList.pPrev();
    if (null != previousItem)
        tab.setView(viewList.pPrev());
}
