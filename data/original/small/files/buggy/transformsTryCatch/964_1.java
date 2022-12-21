public static void init() {
    MinecraftForge.EVENT_BUS.register(new com.m4thg33k.m4ththings.handlers.ClientTickHandler());
    try {
        MinecraftForge.EVENT_BUS.register(new com.m4thg33k.m4ththings.handlers.TextureHandler());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    MinecraftForge.EVENT_BUS.register(new com.m4thg33k.m4ththings.handlers.MiscModEvents());
}
