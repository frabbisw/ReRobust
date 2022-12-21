@org.bukkit.event.EventHandler
public void onDamage(org.bukkit.event.entity.EntityDamageEvent e) {
    try {
        if ((e.getEntity()) instanceof org.bukkit.entity.Player) {
            if ((pl.getGame().getStatus()) != (GameStatus.PLAYING)) {
                e.setCancelled(true);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
