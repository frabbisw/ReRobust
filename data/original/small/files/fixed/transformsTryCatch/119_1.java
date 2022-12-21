private boolean executeSW_BREAK() {
    try {
        if (!(checkEOL()))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mSwitch) != null) {
        ExecutingLineIndex = mSwitch.mEnd;
    }
    return true;
}
