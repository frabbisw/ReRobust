@butterknife.OnClick(value = R.id.image_view_setting)
void clickSetting() {
    startActivity(new android.content.Intent(this, app.com.warattil.activities.SettingActivity.class));
    try {
        this.finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
