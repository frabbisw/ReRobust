@java.lang.Override
public void onEnable() {
    try {
        getLogger().info(((org.bukkit.ChatColor.LIGHT_PURPLE) + "Plugin has been enabled correctly!"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
