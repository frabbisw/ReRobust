public static void init() {
    MinecraftForge.EVENT_BUS.register(new com.m4thg33k.m4ththings.handlers.ClientTickHandler());
    System.out.println("log");
    MinecraftForge.EVENT_BUS.register(new com.m4thg33k.m4ththings.handlers.TextureHandler());
    MinecraftForge.EVENT_BUS.register(new com.m4thg33k.m4ththings.handlers.MiscModEvents());
}
