@java.lang.Override
public void run() {
    try {
        Settings.Secure.putString(mContext.getContentResolver(), "screensaver_components", (((mContext.getApplicationInfo().packageName) + "/") + (com.komok.dreamapprunner.DreamAppRunnerService.class.getName())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
