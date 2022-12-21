public boolean callTargetEvent(org.bukkit.event.entity.EntityTargetEvent event) {
    boolean found = false;
    try {
        for (net.citizensnpcs.npctypes.CitizensNPC type : types.values()) {
            type.onTarget(event);
            if (!found) {
                found = true;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return found;
}
