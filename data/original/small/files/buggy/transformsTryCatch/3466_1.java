public static void initTextures() {
    try {
        dmfmm.StarvationAhoy.Core.Init.CropwashTextureRegistry.registerBlock(WashLib.washBarrelName, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dmfmm.StarvationAhoy.Core.Init.CropwashTextureRegistry.doDirtyItem();
}
