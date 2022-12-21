private void showSmsToast(com.unifyx.messagelistener.Sms sms) {
    System.out.println("log");
    android.widget.Toast.makeText(this, sms.getMsg(), Toast.LENGTH_LONG).show();
}
