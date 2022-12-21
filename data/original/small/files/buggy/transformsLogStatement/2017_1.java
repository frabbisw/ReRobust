@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
public static boolean isSystemAlertPermissionGranted(android.content.Context context) {
    System.out.println("log");
    return ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) || (android.provider.Settings.canDrawOverlays(context));
}
