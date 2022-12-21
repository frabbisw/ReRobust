private void launchMain() {
    System.out.println("log");
    shutdown();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.mad.utsstudcentre.Controller.MainActivity.class);
    startActivity(intent);
    finish();
}
