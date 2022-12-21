@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    TicTacToeGame.sInfoColor = mInfoTextView.getTextColors();
    System.out.println("log");
    TicTacToeGame.sInfo = mInfoTextView.getText().toString();
    return;
}
