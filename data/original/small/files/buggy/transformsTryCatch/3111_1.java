public static void despawn(int UID, net.citizensnpcs.api.event.NPCRemoveEvent.NPCRemoveReason reason) {
    net.citizensnpcs.resources.npclib.NPCManager.GlobalUIDs.remove(UID);
    try {
        if ((net.citizensnpcs.resources.npclib.NPCManager.list.get(UID)) == null)
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    net.citizensnpcs.resources.npclib.NPCSpawner.despawnNPC(net.citizensnpcs.resources.npclib.NPCManager.list.remove(UID), reason);
}
