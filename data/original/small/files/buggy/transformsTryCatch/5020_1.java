@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.zhangwx.dynamicpermissionsrequest.permission.EasyPermissions.requestPermissions(getParent(), R.mipmap.ic_launcher, "RequestLocationPermissions", getString(R.string.action_settings), PermissionUtils.REQUEST_CONTACTS_CODE, PermissionUtils.PERMISSIONS_CONTACTS_GROUP);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
