public static boolean setID(long id) {
    if (null != (com.mycompany.steamachievementtracker.SteamHandler.selected)) {
        com.mycompany.steamachievementtracker.SteamHandler.selected.haltThreads();
    }
    com.mycompany.steamachievementtracker.SteamHandler.selected = new com.mycompany.steamachievementtracker.Account(id, false);
    return true;
}
