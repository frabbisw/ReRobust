public static void switchKeyboardLayout(java.lang.String layoutName) {
    try {
        if ((layoutName == null) || (layoutName.isEmpty())) {
            throw new java.lang.RuntimeException(("A valid layout ID is expected. Found:  " + layoutName));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
