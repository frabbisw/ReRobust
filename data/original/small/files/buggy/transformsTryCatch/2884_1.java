private void onStartAnimation(int itemId) {
    android.view.View item = mFixedItem.get(itemId);
    try {
        itemAutoMove(item, mPerTranslateY, 2.0F);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    preItemId = itemId;
}
