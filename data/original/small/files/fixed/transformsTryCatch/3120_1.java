@java.lang.Override
public void goResetPassword() {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.belatrixsf.connect.ui.resetpassword.ResetPasswordActivity.class);
    try {
        startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
