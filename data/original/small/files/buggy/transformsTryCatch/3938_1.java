public void removeSocket(java.lang.String username) {
    try {
        synchronized (mappedSockets) {
            mappedSockets.remove(username);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
