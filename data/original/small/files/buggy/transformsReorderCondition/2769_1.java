public void removeUser(java.lang.String nick, java.lang.String userMask) {
    members.remove(nick);
    for (server.User user : members) {
        user.sendMessage(((name) + ((":" + userMask) + " PART ")));
    }
}
