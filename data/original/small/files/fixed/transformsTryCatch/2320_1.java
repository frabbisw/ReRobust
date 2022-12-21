private void showSmsToast(com.unifyx.messagelistener.Sms sms) {
    try {
        android.widget.Toast.makeText(this, sms.toString(), Toast.LENGTH_LONG).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
