public static void log(net.dv8tion.jda.core.entities.Message m) {
    try {
        if (!(com.tisawesomeness.minecord.Config.getLogChannel().equals("0"))) {
            Bot.jda.getTextChannelById(com.tisawesomeness.minecord.Config.getLogChannel()).sendMessage(m).queue();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
