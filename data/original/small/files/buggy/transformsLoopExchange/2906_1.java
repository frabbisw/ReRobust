private void hideAllViewExceptKeyBoard() {
    com.cpoopc.smoothemotionkeyboard.utils.DebugLog.e("----");
    {
        int i = 0;
        while (i < (showViewList.size())) {
            hideView(showViewList.get(i));
            i++;
        }
    }
}
