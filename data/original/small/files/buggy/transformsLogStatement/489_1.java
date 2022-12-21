public static final boolean giveDefault(com.github.unchama.growthtool.GrowthTool.GrowthToolType gt, org.bukkit.entity.Player player) {
    System.out.println("log");
    return com.github.unchama.growthtool.GrowthTool.managermap.get(gt.getManagerClass()).giveDefault(player);
}
