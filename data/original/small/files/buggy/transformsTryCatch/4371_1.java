public void cmdReload(org.bukkit.command.CommandSender s, org.bukkit.plugin.Plugin pluginstance) {
    try {
        HCH.reloadConfigs();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    s.sendMessage(gvlfm78.plugin.Hotels.managers.Mes.mes("chat.commands.reload.success"));
}
