@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    try {
        TicTacToeGame.sInfoColor = mInfoTextView.getTextColors();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return;
}
