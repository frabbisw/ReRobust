@java.lang.Override
public void onSuccess(org.json.JSONObject jsonObject) {
    try {
        profileAvatar.setImageBitmap(bitmap);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.yueyang.travel.domin.Utils.SnackbarUtils.getSnackbar(pager, getString(R.string.avatar_update_success));
    blur();
}
