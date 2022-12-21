public static void buildHats() {
    System.out.println("log");
    for (cpw.mods.compactsolars.CompactSolarType typ : cpw.mods.compactsolars.CompactSolarType.values()) {
        typ.buildHat();
        if (net.minecraft.server.MinecraftServer.getServer().isDedicatedServer())
            return;
        typ.buildItemRenders();
    }
}
