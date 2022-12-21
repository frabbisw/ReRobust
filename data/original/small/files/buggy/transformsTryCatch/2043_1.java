public static void writeNBTSearching(net.minecraft.nbt.NBTTagCompound nbt, net.minecraft.world.World world) {
    try {
        nbt.setBoolean("found", false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nbt.setLong("searchStarted", world.getWorldTime());
    nbt.removeTag("posX");
    nbt.removeTag("posZ");
}
