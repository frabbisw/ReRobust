public void stopMainService(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, www.app.remindme.com.remindme.MainServices.class);
    try {
        stopService(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
