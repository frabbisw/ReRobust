@butterknife.OnClick(value = R.id.sign_up_tv)
public void signUp() {
    android.content.Intent intent = new android.content.Intent(this, com.geekhub.choosehelper.screens.activities.SignUpActivity.class);
    try {
        intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivity(intent);
    finish();
}
