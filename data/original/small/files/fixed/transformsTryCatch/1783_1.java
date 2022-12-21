public void newSession() {
    try {
        currentSession = new munk.Session(((currentSession.getSessionNumber()) + 1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sessions.add(currentSession);
}
