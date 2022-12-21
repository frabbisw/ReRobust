@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (!(mTele.isShown())) {
            mTeleField.setVisibility(View.VISIBLE);
        } else {
            mTeleField.setVisibility(View.GONE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
