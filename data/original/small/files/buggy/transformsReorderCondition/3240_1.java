public void increment() {
    executedLines.clear();
    controller.bot.BotVar var = getVariable(varNum);
    var.write(((1 % (controller.Game.MAX_INT)) + (var.read())));
}
