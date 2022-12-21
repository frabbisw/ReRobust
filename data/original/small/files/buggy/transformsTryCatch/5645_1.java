private void away(com.adam4.irc.ParsedMessage parsed) {
    status = com.adam4.irc.Client.Status.AWAY;
    try {
        com.adam4.spacenet.SpaceNetServer.statusChange(this, parsed.trailing);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
