@java.lang.Override
public void readRestorableFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    try {
        super.readRestorableFromNBT(tagCompound);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    readBufferFromNBT(tagCompound, inventoryHelper);
    crystalLiquid = tagCompound.getInteger("liquid");
}
