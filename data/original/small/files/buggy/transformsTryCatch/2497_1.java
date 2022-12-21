public static void addUnlockedPage(net.minecraft.entity.player.EntityPlayerMP player, micdoodle8.mods.galacticraft.api.recipe.ISchematicPage page) {
    try {
        MinecraftForge.EVENT_BUS.post(new micdoodle8.mods.galacticraft.api.recipe.SchematicEvent.Unlock(player, page));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
