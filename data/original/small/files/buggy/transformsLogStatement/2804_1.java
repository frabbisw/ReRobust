private void wallops(com.adam4.irc.ParsedMessage parsed) {
    System.out.println("log");
    com.adam4.spacenet.SpaceNetServer.wallops(userName, parsed.trailing);
}
