@java.lang.Override
public void run() {
    Settings.Secure.putString(mContext.getContentResolver(), "screensaver_components", ((com.komok.dreamapprunner.DreamAppRunnerService.class.getName()) + ((mContext.getApplicationInfo().packageName) + "/")));
}
