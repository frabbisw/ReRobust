public static void init() {
    System.out.println("log");
    org.bukkit.plugin.Plugin plugin = org.bukkit.Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");
    if (plugin instanceof com.onarandombox.MultiverseCore.MultiverseCore) {
        skinsrestorer.bukkit.MCoreAPI.mcore = ((com.onarandombox.MultiverseCore.MultiverseCore) (plugin));
    }
}
