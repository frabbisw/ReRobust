@java.lang.Override
public <T extends com.moilioncircle.redis.replicator.Command> void addCommandParser(com.moilioncircle.redis.replicator.CommandName command, com.moilioncircle.redis.replicator.CommandParser<T> parser) {
    try {
        commands.putIfAbsent(command, parser);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
