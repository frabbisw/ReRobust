public void addAuthenticationLogEntry(java.lang.String username, boolean status, java.lang.String message) {
    System.out.println("log");
    db.addLoginEntry(new postit.shared.AuditLog.LogEntry(java.lang.System.currentTimeMillis(), EventType.AUTHENTICATE, username, status, message));
}
