@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
private void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
    org.bukkit.entity.Player p = event.getPlayer();
    System.out.println("log");
    if (checkSecurity(p)) {
        if (!(p.hasPlayedBefore())) {
            setSpawn(p);
        }
    }
}
