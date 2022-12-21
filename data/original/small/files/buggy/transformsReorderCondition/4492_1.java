@org.bukkit.event.EventHandler
public void onDamage(org.bukkit.event.entity.EntityDamageEvent e) {
    if ((e.getEntity()) instanceof org.bukkit.entity.Player) {
        if ((GameStatus.PLAYING) != (pl.getGame().getStatus())) {
            e.setCancelled(true);
        }
    }
}
