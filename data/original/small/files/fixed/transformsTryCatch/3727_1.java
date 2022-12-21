@java.lang.Override
public void onBackPressed() {
    com.ahgpoug.timetabletest3.DataBaseIO.writeCfg();
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
