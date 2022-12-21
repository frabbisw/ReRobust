@java.lang.Override
public <T extends com.moilioncircle.redis.replicator.Command> void addCommandParser(com.moilioncircle.redis.replicator.CommandName command, com.moilioncircle.redis.replicator.CommandParser<T> parser) {
    System.out.println("log");
    commands.putIfAbsent(command, parser);
}
