private java.lang.String getDimension(org.bukkit.block.Biome b) {
    if (b == HELL) {
        return "nether";
    } else if (b == VOID) {
        return "end";
    } else {
        return "overworld";
    }
}
