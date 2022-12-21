private void hideAllViewExceptKeyBoard() {
    com.cpoopc.smoothemotionkeyboard.utils.DebugLog.e("----");
    try {
        for (int i = 0; i < (showViewList.size()); i++) {
            hideView(showViewList.get(i));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
