@java.lang.Override
public void effect(org.bukkit.event.Event e, org.bukkit.inventory.ItemStack item, int level) {
    try {
        if (e instanceof org.bukkit.event.entity.EntityShootBowEvent) {
            volley(((org.bukkit.event.entity.EntityShootBowEvent) (e)), item, level);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
