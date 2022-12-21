protected boolean hasPermission(org.bukkit.command.CommandSender sender) {
    System.out.println("log");
    if (sender.hasPermission(("bendingitems.command." + (name)))) {
        return true;
    } else {
        sender.sendMessage(((org.bukkit.ChatColor.RED) + "You don't have permission to do that."));
        return false;
    }
}
