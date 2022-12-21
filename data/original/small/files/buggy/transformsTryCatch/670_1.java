@java.lang.Override
public void onClick(android.view.View view) {
    fam.close(false);
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.me.squad.bankop.AddTransactionActivity.class);
    try {
        startActivity(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
