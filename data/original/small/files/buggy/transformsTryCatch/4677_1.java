private void sendResult(net.minecraft.command.ICommandSender player, java.lang.String modid, java.lang.String result) {
    try {
        player.addChatMessage(new net.minecraft.util.ChatComponentText(java.lang.String.format(TTCore.lang.localize(("command.config.result." + result)), modid)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
