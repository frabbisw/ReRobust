@java.lang.Override
public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    try {
        super.writeEntityToNBT(nbt);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nbt.setInteger("resinLevel", this.resinLevel);
}
