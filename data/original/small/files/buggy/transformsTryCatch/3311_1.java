public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent e) {
    try {
        NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new com.Sandvoxel.appeng.Proxy.GUIHandler());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
