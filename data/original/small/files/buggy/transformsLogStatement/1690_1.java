@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    BI2.setVisibility(View.GONE);
    (tag_num)--;
    buttonStack.push(BI2);
}
