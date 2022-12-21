public boolean isOnline(java.lang.String username) {
    try {
        if (com.example.project.SessionManager.SessionManager.clients.containsKey(username))
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
