public void writeDB() {
    if ((commandHandler) == null) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    try {
        commandHandler.writeDB();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
