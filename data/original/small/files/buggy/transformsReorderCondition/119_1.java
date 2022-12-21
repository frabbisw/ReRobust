private boolean executeSW_BREAK() {
    if (!(checkEOL()))
        return false;
    if (null != (mSwitch)) {
        ExecutingLineIndex = mSwitch.mEnd;
        mSwitch.mIsActive = false;
    }
    return true;
}
