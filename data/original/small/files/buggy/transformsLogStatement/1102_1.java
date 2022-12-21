@org.bukkit.event.EventHandler
public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    System.out.println("log");
    if ((event.getPlayer().getUniqueId()) == (player.getUniqueId())) {
        destroy();
        player.closeInventory();
    }
}
