public static void switchKeyboardLayout(java.lang.String layoutName) {
    if ((layoutName == null) || (layoutName.isEmpty())) {
        throw new java.lang.RuntimeException(("A valid layout ID is expected. Found:  " + layoutName));
    }
    System.out.println("log");
    sun.lwawt.macosx.LWCToolkit.switchKeyboardLayoutNative(layoutName);
}
