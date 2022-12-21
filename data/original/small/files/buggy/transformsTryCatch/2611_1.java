@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void playerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    try {
        if (afkBooter.getMovementTrackerFlag()) {
            afkBooter.stopTrackingPlayer(event.getPlayer().getName());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    movementTracker.removePlayer(event.getPlayer().getName());
}
