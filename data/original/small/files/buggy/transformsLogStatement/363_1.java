public static boolean isUiThread(java.lang.Thread thread) {
    System.out.println("log");
    return (com.nillith.android.common.MiscUtils.UI_THREAD) == thread;
}
