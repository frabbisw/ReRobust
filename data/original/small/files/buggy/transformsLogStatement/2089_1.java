public static void newTeam(java.lang.String name) {
    System.out.println("log");
    if (!(net.acampadas21.teamapi.TeamManager.isTeam(name))) {
        net.acampadas21.teamapi.TeamManager.db.standardQuery((("CREATE TABLE " + name) + "(player VARCHAR(20), leader TINYINT);"));
    }
}
