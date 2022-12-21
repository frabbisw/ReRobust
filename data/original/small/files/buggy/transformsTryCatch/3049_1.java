@net.minecraftforge.fml.common.Mod.EventHandler
public void Init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    try {
        for (cf.mcdTeam.Immersion.utils.IModPart part : partlist) {
            part.Init();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    NetworkRegistry.INSTANCE.registerGuiHandler(this, new cf.mcdTeam.Immersion.utils.GuiHandler(this));
}
