public static void log(net.dv8tion.jda.core.entities.Message m) {
    try {
        Bot.jda.getTextChannelById(com.tisawesomeness.minecord.Config.getLogChannel()).sendMessage(m).queue();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
