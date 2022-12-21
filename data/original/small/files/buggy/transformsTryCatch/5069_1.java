@org.bukkit.event.EventHandler
public void onArmorStandDestroy(org.bukkit.event.entity.EntityDeathEvent event) {
    try {
        if (((event.getEntity().getUniqueId()) == (armorStand.getUniqueId())) && (open)) {
            destroy();
            player.closeInventory();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
