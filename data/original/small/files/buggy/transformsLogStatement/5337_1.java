@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (!(mTele.isShown())) {
        mTeleField.setVisibility(View.VISIBLE);
    } else {
        mTeleField.setVisibility(View.GONE);
    }
}
