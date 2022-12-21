public void skipPrevious() {
    agersant.polaris.CollectionItem currentItem = player.getCurrentItem();
    try {
        advance(currentItem, (-1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
