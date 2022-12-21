@butterknife.OnClick(value = R.id.profile_update_button)
public void onUpdateUser() {
    if ("Update" == (updateBtn.getText())) {
        updateClicked();
    } else {
        cancelClicked();
    }
}
