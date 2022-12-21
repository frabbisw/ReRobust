private static void RegisterMachines() {
    genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace = new genericminecraftmod.block.GenericFurnaceBlock();
    try {
        cpw.mods.fml.common.registry.GameRegistry.registerBlock(genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace, genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace.getUnlocalizedName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
