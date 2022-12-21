boolean castDisconnect(boolean castDisconnect) {
    try {
        if (castDisconnect) {
            castManager.disconnect();
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
