@org.bukkit.event.EventHandler
public void onArmorStandDestroy(org.bukkit.event.entity.EntityDeathEvent event) {
    if ((open) && ((event.getEntity().getUniqueId()) == (armorStand.getUniqueId()))) {
        destroy();
        player.closeInventory();
    }
}
