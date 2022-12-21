public static boolean setID(long id) {
    try {
        if ((com.mycompany.steamachievementtracker.SteamHandler.selected) != null) {
            com.mycompany.steamachievementtracker.SteamHandler.selected.haltThreads();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.mycompany.steamachievementtracker.SteamHandler.selected = new com.mycompany.steamachievementtracker.Account(id, false);
    return true;
}
