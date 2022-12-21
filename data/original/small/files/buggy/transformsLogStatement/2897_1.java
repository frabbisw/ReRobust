public static void log(net.dv8tion.jda.core.entities.Message m) {
    System.out.println("log");
    Bot.jda.getTextChannelById(com.tisawesomeness.minecord.Config.getLogChannel()).sendMessage(m).queue();
}
