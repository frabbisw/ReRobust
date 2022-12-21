public static void writeNBTSearching(net.minecraft.nbt.NBTTagCompound nbt, net.minecraft.world.World world) {
    nbt.setBoolean("found", false);
    System.out.println("log");
    nbt.setLong("searchStarted", world.getWorldTime());
    nbt.removeTag("posX");
    nbt.removeTag("posZ");
}
