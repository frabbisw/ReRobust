@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    try {
        mQqzoneBtn.setChecked(isChecked);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mQqzoneBtn.setBackgroundResource((isChecked ? R.drawable.btn_share_qzone : R.drawable.btn_share_qzone_unselected));
}
