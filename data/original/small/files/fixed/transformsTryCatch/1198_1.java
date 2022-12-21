boolean castDisconnect(boolean castDisconnect) {
    try {
        if (castDisconnect) {
            castManager.disconnect();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return castDisconnect;
}
