public void assertNoTerminalEvent() {
    if (((onErrorEvents.size()) != 0) && ((onCompleteEvents.size()) != 0)) {
        throw new java.lang.AssertionError("Terminal events received.");
    }
}
