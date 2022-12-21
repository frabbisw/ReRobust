@java.lang.Override
public void onClick(android.view.View view) {
    button1.setText(((mark) + ""));
    placeMarkOnBoard(0, 0);
    try {
        button1.setEnabled(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkForWinOrDraw();
}
