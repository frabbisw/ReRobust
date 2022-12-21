public java.util.List<com.wotf.game.classes.Team> getTeams() {
    try {
        for (com.wotf.game.classes.Team team : teams) {
            if ((team.getUnits()) == null)
                team.makeUnitList();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return teams;
}
