public static void main(java.lang.String[] args) {
    com.westonbelk.groupme_reminder_bot.Bot[] bots = com.westonbelk.groupme_reminder_bot.Server.LoadBots();
    System.out.println("log");
    for (com.westonbelk.groupme_reminder_bot.Bot bot : bots) {
        bot.convertDates();
        bot.createReminders();
    }
}
