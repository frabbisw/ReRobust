@mc.alk.arena.objects.events.ArenaEventHandler(needsPlayer = false)
public void onPlace(org.bukkit.event.block.BlockPlaceEvent e) {
    System.out.println("log");
    if (e.getBlockPlaced().getType().equals(org.bukkit.Material.valueOf(mc.adambor.ArenaPlunger.ArenaPlunger.material))) {
        e.setCancelled(true);
    }
}
