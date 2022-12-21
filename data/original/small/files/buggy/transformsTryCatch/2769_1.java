public void removeUser(java.lang.String nick, java.lang.String userMask) {
    members.remove(nick);
    try {
        for (server.User user : members) {
            user.sendMessage((((":" + userMask) + " PART ") + (name)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
