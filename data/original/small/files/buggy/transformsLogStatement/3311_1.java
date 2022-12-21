public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent e) {
    System.out.println("log");
    NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new com.Sandvoxel.appeng.Proxy.GUIHandler());
}
