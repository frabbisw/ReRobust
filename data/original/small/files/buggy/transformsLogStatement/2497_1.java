public static void addUnlockedPage(net.minecraft.entity.player.EntityPlayerMP player, micdoodle8.mods.galacticraft.api.recipe.ISchematicPage page) {
    System.out.println("log");
    MinecraftForge.EVENT_BUS.post(new micdoodle8.mods.galacticraft.api.recipe.SchematicEvent.Unlock(player, page));
}
