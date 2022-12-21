public void cmdReload(org.bukkit.command.CommandSender s) {
    HCH.reloadConfigs();
    try {
        s.sendMessage(gvlfm78.plugin.Hotels.managers.Mes.mes("chat.commands.reload.success"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
