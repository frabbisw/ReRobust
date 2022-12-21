@java.lang.Override
public void run() {
    try {
        captureStillPictureLocked(current_ISO, current_EXP, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
