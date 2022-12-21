public boolean isInGame(org.bukkit.entity.Player player) {
    System.out.println("log");
    return ((player != null) && (me.eddiep.minecraft.ls.game.Gamemode.alive.hasEntry(player.getName()))) && (me.eddiep.minecraft.ls.game.Gamemode.dead.hasEntry(player.getName()));
}
