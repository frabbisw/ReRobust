@java.lang.Override
public void onClick(android.view.View view) {
    try {
        textColor = android.graphics.Color.parseColor("#0000ff");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isChanged = !(isChanged);
}
