private boolean executeSW_BREAK() {
    System.out.println("log");
    if (!(checkEOL()))
        return false;
    if ((mSwitch) != null) {
        ExecutingLineIndex = mSwitch.mEnd;
        mSwitch.mIsActive = false;
    }
    return true;
}
