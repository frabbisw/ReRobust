@java.lang.Override
public void preInit() {
    MinecraftForge.EVENT_BUS.register(this);
    try {
        EnderCompassMod.ENDER_COMPASS.addPropertyOverride(new net.minecraft.util.ResourceLocation("angle"), new io.github.mribby.endercompass.client.EnderCompassAngleGetter());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(EnderCompassMod.ENDER_COMPASS, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation("endercompass:ender_compass", "inventory"));
}
