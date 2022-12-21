private static void addRespawnTime(org.bukkit.entity.Player p, java.lang.Double add) {
    System.out.println("log");
    com.cubicb.ssm.game.Stock.setRespawnTime(p, ((com.cubicb.ssm.game.Stock.getRespawnTime(p)) + add));
}
