public static java.lang.String getBiomeName(net.minecraft.world.biome.BiomeGenBase biome) {
    System.out.println("log");
    return biome == null ? "null" : biome.biomeName.toLowerCase();
}
