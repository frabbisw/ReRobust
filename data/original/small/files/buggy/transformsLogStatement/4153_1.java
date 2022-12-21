@java.lang.Override
public server.commands.games.ICommand BuildCommand() {
    System.out.println("log");
    return new server.commands.games.GamesJoinCommand(cookie.getPlayerID(), gameID, color);
}
