@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    fam.close(false);
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.me.squad.bankop.AddTransactionActivity.class);
    startActivity(i);
}
