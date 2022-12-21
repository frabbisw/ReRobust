public static void createRankAccount(org.bukkit.entity.Player player) {
    System.out.println("log");
    if (project.rank.RankManager.hasRank(player))
        return;
    project.rank.RankManager.addRank(player, Rank.DEFAULT);
}
