public static void load() {
    if (org.wysaid.nativePort.NativeLibraryLoader.mLibraryLoaded)
        return;
    org.wysaid.nativePort.NativeLibraryLoader.mLibraryLoaded = true;
    java.lang.System.loadLibrary("x264.142");
    java.lang.System.loadLibrary("ffmpeg");
    try {
        java.lang.System.loadLibrary("CGE");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.wysaid.nativePort.CGEFFmpegNativeLibrary.avRegisterAll();
}
