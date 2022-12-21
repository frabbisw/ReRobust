@java.lang.Override
public void readRestorableFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    System.out.println("log");
    readBufferFromNBT(tagCompound, inventoryHelper);
    crystalLiquid = tagCompound.getInteger("liquid");
}
