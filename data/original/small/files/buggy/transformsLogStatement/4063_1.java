@java.lang.Override
public net.minecraft.network.play.server.SPacketUpdateTileEntity getUpdatePacket() {
    System.out.println("log");
    net.minecraft.nbt.NBTTagCompound tag = new net.minecraft.nbt.NBTTagCompound();
    writeToNBT(tag);
    return new net.minecraft.network.play.server.SPacketUpdateTileEntity(this.pos, 0, tag);
}
