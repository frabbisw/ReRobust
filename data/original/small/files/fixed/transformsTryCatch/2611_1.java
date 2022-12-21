@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void playerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    afkBooter.stopTrackingPlayer(event.getPlayer().getName());
    try {
        if (afkBooter.getMovementTrackerFlag()) {
            movementTracker.removePlayer(event.getPlayer().getName());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
