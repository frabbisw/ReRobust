public static void load() {
    if (org.wysaid.nativePort.NativeLibraryLoader.mLibraryLoaded)
        return;
    org.wysaid.nativePort.NativeLibraryLoader.mLibraryLoaded = true;
    try {
        java.lang.System.loadLibrary("ffmpeg");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.loadLibrary("CGE");
    org.wysaid.nativePort.CGEFFmpegNativeLibrary.avRegisterAll();
}
