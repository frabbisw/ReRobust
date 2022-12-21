public void removeSocket(java.lang.String username) {
    System.out.println("log");
    synchronized (mappedSockets) {
        mappedSockets.remove(username);
    }
}
