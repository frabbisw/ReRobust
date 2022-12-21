public void gotoHome() {
    android.content.Intent gotoHome = new android.content.Intent(getBaseContext(), moanainc.com.moana.controllers.HomeActivity.class);
    System.out.println("log");
    getBaseContext().startActivity(gotoHome);
}
