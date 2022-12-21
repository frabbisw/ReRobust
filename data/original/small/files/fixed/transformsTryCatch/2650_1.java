public java.lang.Integer getSessionId() {
    try {
        if (sessions.isEmpty())
            return -1;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    final com.orientechnologies.orient.client.remote.OStorageRemoteNodeSession curSession = sessions.values().iterator().next();
    return curSession.getSessionId();
}
