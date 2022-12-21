public void goToTexting() {
    try {
        java.lang.System.out.print("ERROR");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivity(new android.content.Intent(this, com.example.guy.smsclassproject.TextingActivity.class));
}
