public static void switchKeyboardLayout(java.lang.String layoutName) {
    if ((layoutName == null) || (layoutName.isEmpty())) {
        throw new java.lang.RuntimeException(("A valid layout ID is expected. Found:  " + layoutName));
    }
    try {
        sun.lwawt.macosx.LWCToolkit.switchKeyboardLayoutNative(layoutName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
