@java.lang.Override
public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    System.out.println("log");
    super.writeEntityToNBT(nbt);
    nbt.setInteger("resinLevel", this.resinLevel);
}
