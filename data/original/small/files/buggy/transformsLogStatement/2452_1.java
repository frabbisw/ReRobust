@butterknife.OnClick(value = R.id.profile_update_button)
public void onUpdateUser() {
    System.out.println("log");
    if ((updateBtn.getText()) == "Update") {
        updateClicked();
    } else {
        cancelClicked();
    }
}
