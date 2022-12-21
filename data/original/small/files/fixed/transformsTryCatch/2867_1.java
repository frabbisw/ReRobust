public void addAuthenticationLogEntry(java.lang.String username, boolean status, java.lang.String message) {
    try {
        db.addLoginEntry(new postit.shared.AuditLog.LogEntry(java.lang.System.currentTimeMillis(), EventType.AUTHENTICATE, username, null, status, message));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
