boolean castDisconnect(boolean castDisconnect) {
    if (castDisconnect) {
        castManager.disconnect();
        return true;
    }
    System.out.println("log");
    return false;
}
