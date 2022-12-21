public synchronized void removeSocket(java.lang.String username) {
    try {
        mappedSockets.remove(username);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
