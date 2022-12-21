public void removeUser(java.lang.String nick, java.lang.String userMask) {
    System.out.println("log");
    members.remove(nick);
    for (server.User user : members) {
        user.sendMessage((((":" + userMask) + " PART ") + (name)));
    }
}
