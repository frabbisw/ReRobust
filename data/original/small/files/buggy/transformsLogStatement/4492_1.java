@org.bukkit.event.EventHandler
public void onDamage(org.bukkit.event.entity.EntityDamageEvent e) {
    System.out.println("log");
    if ((e.getEntity()) instanceof org.bukkit.entity.Player) {
        if ((pl.getGame().getStatus()) != (GameStatus.PLAYING)) {
            e.setCancelled(true);
        }
    }
}
