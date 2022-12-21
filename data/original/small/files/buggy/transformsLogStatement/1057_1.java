@java.lang.Override
public void onPermissionsDenied(int requestCode, java.util.List<java.lang.String> perms) {
    System.out.println("log");
    if (pub.devrel.easypermissions.EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
        new pub.devrel.easypermissions.AppSettingsDialog.Builder(this).build().show();
    }
}
