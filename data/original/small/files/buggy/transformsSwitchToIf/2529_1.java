@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.bck_btn_id) {
        {
            backButtonPressed();
            break;
        }
    } else if (v.getId() == R.id.home_btn_id) {
        {
            homeButtonPressed();
        }
    } else if (v.getId() == R.id.fwd_btn_id) {
        {
            forwardButtonPressed();
        }
    }
}
