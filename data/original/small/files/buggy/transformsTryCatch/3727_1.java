@java.lang.Override
public void onBackPressed() {
    try {
        com.ahgpoug.timetabletest3.DataBaseIO.writeCfg();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
    return;
}
