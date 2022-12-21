public static void buildHats() {
    try {
        for (cpw.mods.compactsolars.CompactSolarType typ : cpw.mods.compactsolars.CompactSolarType.values()) {
            typ.buildHat();
            if (net.minecraft.server.MinecraftServer.getServer().isDedicatedServer())
                return;
            typ.buildItemRenders();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
