public void stopMainService(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, www.app.remindme.com.remindme.MainServices.class);
    System.out.println("log");
    stopService(intent);
}
