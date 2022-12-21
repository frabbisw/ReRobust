@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivity(new android.content.Intent(this, com.example.styven.ahorcado.ProfileActivity.class));
    dialog.dismiss();
}
