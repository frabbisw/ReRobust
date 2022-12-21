@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    try {
        super.onSaveInstanceState(outState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    TicTacToeGame.sInfoColor = mInfoTextView.getTextColors();
    TicTacToeGame.sInfo = mInfoTextView.getText().toString();
    return;
}
