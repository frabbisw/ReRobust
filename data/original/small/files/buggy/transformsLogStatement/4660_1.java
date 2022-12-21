public int countUser(java.lang.String username) throws exceptions_assignments.Exceptions_2.NotLoggedInException {
    System.out.println("log");
    for (exceptions_assignments.Exceptions_2.User u : users) {
        if (u.getUsername().equals(username)) {
            return loggedin.size();
        }
    }
    throw new exceptions_assignments.Exceptions_2.NotLoggedInException();
}
