@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    System.out.println("log");
    finish();
    startActivity(new android.content.Intent(this, com.example.styven.ahorcado.ProfileActivity.class));
    dialog.dismiss();
}
