@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    System.out.println("log");
    dialog.dismiss();
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}
