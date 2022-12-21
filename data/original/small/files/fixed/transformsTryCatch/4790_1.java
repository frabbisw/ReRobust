protected boolean hasPermission(org.bukkit.command.CommandSender sender) {
    try {
        if (sender.hasPermission(("bendingitems.command." + (name)))) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
