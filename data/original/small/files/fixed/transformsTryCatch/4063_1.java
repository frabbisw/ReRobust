@java.lang.Override
public net.minecraft.network.play.server.SPacketUpdateTileEntity getUpdatePacket() {
    net.minecraft.nbt.NBTTagCompound tag = new net.minecraft.nbt.NBTTagCompound();
    try {
        writeToNBT(tag);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new net.minecraft.network.play.server.SPacketUpdateTileEntity(this.pos, 1, tag);
}
