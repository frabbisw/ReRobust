@butterknife.OnClick(value = R.id.profile_update_button)
public void onUpdateUser() {
    try {
        if ((updateBtn.getText()) == "Update") {
            updateClicked();
        } else {
            cancelClicked();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
