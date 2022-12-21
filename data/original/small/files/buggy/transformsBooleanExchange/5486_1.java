public boolean callTargetEvent(org.bukkit.event.entity.EntityTargetEvent event) {
    boolean found = true;
    for (net.citizensnpcs.npctypes.CitizensNPC type : types.values()) {
        type.onTarget(event);
        if (found) {
            found = false;
        }
    }
    return !(found);
}
