public static final void log(java.lang.String name, me.duncte123.skybot.CustomLog.Level lvl, java.lang.String message) {
    me.duncte123.skybot.SkyBot.logName = name;
    System.out.println("log");
    me.duncte123.skybot.SkyBot.logger2.log(lvl, message);
}
