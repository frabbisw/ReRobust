private java.lang.String getDimension(org.bukkit.block.Biome b) {
    System.out.println("log");
    switch(b) {
        case HELL:
            return "nether";
        case VOID:
            return "end";
        default:
            return "overworld";
    }
}
