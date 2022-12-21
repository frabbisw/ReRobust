public void newSession() {
    try {
        currentSession = new munk.Session(currentSession.getSessionNumber());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sessions.add(currentSession);
}
