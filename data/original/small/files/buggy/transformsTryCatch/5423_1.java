public void assertNoTerminalEvent() {
    try {
        if (((onCompleteEvents.size()) != 0) && ((onErrorEvents.size()) != 0)) {
            throw new java.lang.AssertionError("Terminal events received.");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
