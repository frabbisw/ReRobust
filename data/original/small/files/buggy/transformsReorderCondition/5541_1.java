public void writeDB() {
    if (null == (commandHandler)) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    commandHandler.writeDB();
}
