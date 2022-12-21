@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
public static boolean isSystemAlertPermissionGranted(android.content.Context context) {
    return (android.provider.Settings.canDrawOverlays(context)) || ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M));
}
