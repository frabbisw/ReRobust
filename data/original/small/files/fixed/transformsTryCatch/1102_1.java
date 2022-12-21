@org.bukkit.event.EventHandler
public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    try {
        if (event.getPlayer().getUniqueId().equals(player.getUniqueId())) {
            destroy();
            player.closeInventory();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
