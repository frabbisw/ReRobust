@java.lang.Override
public void onClick(android.view.View view) {
    textColor = android.graphics.Color.parseColor("#0000ff");
    try {
        mEditor.setTextColor((isChanged ? android.graphics.Color.GREEN : android.graphics.Color.BLUE));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isChanged = !(isChanged);
}
