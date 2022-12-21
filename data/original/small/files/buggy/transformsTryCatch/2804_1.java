private void wallops(com.adam4.irc.ParsedMessage parsed) {
    try {
        com.adam4.spacenet.SpaceNetServer.wallops(userName, parsed.trailing);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
