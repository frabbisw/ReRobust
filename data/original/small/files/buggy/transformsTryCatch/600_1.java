public static void main(java.lang.String[] args) {
    com.westonbelk.groupme_reminder_bot.Bot[] bots = com.westonbelk.groupme_reminder_bot.Server.LoadBots();
    try {
        for (com.westonbelk.groupme_reminder_bot.Bot bot : bots) {
            bot.convertDates();
            bot.createReminders();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
