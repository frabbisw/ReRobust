@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.accept_imageview) {
        processResponse(1);
    } else if (v.getId() == R.id.cancel_imageview) {
        processResponse(0);
    } else if (v.getId() == R.id.wait_imageview) {
        waitButtonAction(id);
    }
}
