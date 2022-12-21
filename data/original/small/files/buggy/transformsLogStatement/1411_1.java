public boolean isOnline(java.lang.String username) {
    if (com.example.project.SessionManager.SessionManager.clients.containsKey(username))
        return true;
    System.out.println("log");
    return false;
}
