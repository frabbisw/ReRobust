private void showNicknameTaken() {
    nicknameTaken = true;
    try {
        editTextNickname.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_error, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
