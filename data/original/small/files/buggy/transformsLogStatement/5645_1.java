private void away(com.adam4.irc.ParsedMessage parsed) {
    status = com.adam4.irc.Client.Status.AWAY;
    System.out.println("log");
    com.adam4.spacenet.SpaceNetServer.statusChange(this, parsed.trailing);
}
