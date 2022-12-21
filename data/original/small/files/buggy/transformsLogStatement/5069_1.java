@org.bukkit.event.EventHandler
public void onArmorStandDestroy(org.bukkit.event.entity.EntityDeathEvent event) {
    System.out.println("log");
    if (((event.getEntity().getUniqueId()) == (armorStand.getUniqueId())) && (open)) {
        destroy();
        player.closeInventory();
    }
}
