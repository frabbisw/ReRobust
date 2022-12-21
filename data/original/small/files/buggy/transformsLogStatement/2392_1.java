public static void load() {
    System.out.println("log");
    if (org.wysaid.nativePort.NativeLibraryLoader.mLibraryLoaded)
        return;
    org.wysaid.nativePort.NativeLibraryLoader.mLibraryLoaded = true;
    java.lang.System.loadLibrary("x264.142");
    java.lang.System.loadLibrary("ffmpeg");
    java.lang.System.loadLibrary("CGE");
    org.wysaid.nativePort.CGEFFmpegNativeLibrary.avRegisterAll();
}
