public void nationLeave(com.palmergames.bukkit.towny.object.Nation nation) {
    remove(nation);
    try {
        com.palmergames.bukkit.towny.TownyMessaging.sendGlobalMessage(com.palmergames.bukkit.towny.TownySettings.getWarTimeForfeitMsg(nation.getName()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkEnd();
}
