public static void createRankAccount(org.bukkit.entity.Player player) {
    if (project.rank.RankManager.hasRank(player))
        return;
    try {
        project.rank.RankManager.addRank(player, Rank.DEFAULT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
