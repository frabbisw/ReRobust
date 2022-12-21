@java.lang.Override
public void onClick(android.view.View v) {
    try {
        BI2.setText(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    BI2.setVisibility(View.GONE);
    (tag_num)--;
    buttonStack.push(BI2);
}
