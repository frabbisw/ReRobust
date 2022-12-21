private void hideAllViewExceptKeyBoard() {
    com.cpoopc.smoothemotionkeyboard.utils.DebugLog.e("----");
    for (int i = 0; (showViewList.size()) > i; i++) {
        hideView(showViewList.get(i));
    }
}
