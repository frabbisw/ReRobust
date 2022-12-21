public static boolean isExtraPlayer(java.lang.String name) {
    try {
        for (java.lang.String name2 : de.DaWik.DaWik.Config.ConfigManager.players) {
            if (name2.equalsIgnoreCase(name)) {
                return true;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
