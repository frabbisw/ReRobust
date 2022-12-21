@org.bukkit.event.EventHandler
public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    try {
        if ((event.getPlayer().getUniqueId()) == (player.getUniqueId())) {
            destroy();
            player.closeInventory();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
