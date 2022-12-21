public static long getActiveSessions() {
    System.out.println("log");
    return org.exist.http.SessionCountListener.activeSessions;
}
