public void newSession() {
    System.out.println("log");
    currentSession = new munk.Session(currentSession.getSessionNumber());
    sessions.add(currentSession);
}
