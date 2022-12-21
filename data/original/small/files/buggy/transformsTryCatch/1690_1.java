@java.lang.Override
public void onClick(android.view.View v) {
    try {
        BI2.setVisibility(View.GONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (tag_num)--;
    buttonStack.push(BI2);
}
