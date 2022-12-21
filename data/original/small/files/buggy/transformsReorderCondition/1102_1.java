@org.bukkit.event.EventHandler
public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    if ((player.getUniqueId()) == (event.getPlayer().getUniqueId())) {
        destroy();
        player.closeInventory();
    }
}
