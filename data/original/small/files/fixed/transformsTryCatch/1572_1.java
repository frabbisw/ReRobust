@butterknife.OnClick(value = R.id.image_view_setting)
void clickSetting() {
    try {
        startActivity(new android.content.Intent(this, app.com.warattil.activities.SettingActivity.class));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
