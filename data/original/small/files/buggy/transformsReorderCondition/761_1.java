public java.util.List<com.wotf.game.classes.Team> getTeams() {
    for (com.wotf.game.classes.Team team : teams) {
        if (null == (team.getUnits()))
            team.makeUnitList();
    }
    return teams;
}
