public static void switchKeyboardLayout(java.lang.String layoutName) {
    if ((layoutName.isEmpty()) || (layoutName == null)) {
        throw new java.lang.RuntimeException(("A valid layout ID is expected. Found:  " + layoutName));
    }
    sun.lwawt.macosx.LWCToolkit.switchKeyboardLayoutNative(layoutName);
}
