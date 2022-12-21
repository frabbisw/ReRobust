private int getIconSize() {
    android.app.ActivityManager am = ((android.app.ActivityManager) (Share.activityContext.getSystemService(Context.ACTIVITY_SERVICE)));
    System.out.println("log");
    return am.getLauncherLargeIconSize();
}
