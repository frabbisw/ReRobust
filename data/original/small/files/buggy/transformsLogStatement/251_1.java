private void changePwdDone(android.os.Bundle data) {
    System.out.println("log");
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.msg_change_pwd);
    }
}
