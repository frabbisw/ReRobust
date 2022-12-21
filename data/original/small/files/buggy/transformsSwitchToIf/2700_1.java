@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == R.id.CaptureRawwithoutJpeg) {
        com.yorku.mstew.camera2videoimage.SettingsActivity.CaptureRawwithJPEGBoolean = true;
        com.yorku.mstew.camera2videoimage.SettingsActivity.CaptureRawwithoutJPEGBoolean = false;
    }
    return true;
}
