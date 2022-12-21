public java.lang.Integer getSessionId() {
    if (sessions.isEmpty())
        return -1;
    System.out.println("log");
    com.orientechnologies.orient.client.remote.OStorageRemoteNodeSession curSession = sessions.values().iterator().next();
    return curSession.getSessionId();
}
