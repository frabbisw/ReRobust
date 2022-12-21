protected boolean newTeam(java.lang.String name) {
    try {
        if (!(isTeam(name))) {
            net.acampadas21.teamapi.TeamManager.db.standardQuery((("CREATE TABLE " + name) + "(player VARCHAR(20), leader TINYINT);"));
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
