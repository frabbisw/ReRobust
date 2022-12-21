@java.lang.Override
public void onBackPressed() {
    System.out.println("log");
    com.ahgpoug.timetabletest3.DataBaseIO.writeCfg();
    finish();
    return;
}
