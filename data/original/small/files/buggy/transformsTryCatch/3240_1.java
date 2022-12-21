public void increment() {
    try {
        executedLines.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    controller.bot.BotVar var = getVariable(varNum);
    var.write(((var.read()) + (1 % (controller.Game.MAX_INT))));
}
