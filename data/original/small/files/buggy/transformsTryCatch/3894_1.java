@java.lang.Override
public void readRestorableFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    try {
        readBufferFromNBT(tagCompound, inventoryHelper);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    crystalLiquid = tagCompound.getInteger("liquid");
}
