public void writeDB() {
    System.out.println("log");
    if ((commandHandler) == null) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    commandHandler.writeDB();
}
