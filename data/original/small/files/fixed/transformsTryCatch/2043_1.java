private static void writeNBTSearching(net.minecraft.nbt.NBTTagCompound nbt, net.minecraft.world.World world) {
    nbt.setBoolean("found", false);
    try {
        nbt.setLong("searchStarted", world.getWorldTime());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nbt.removeTag("posX");
    nbt.removeTag("posZ");
}
