@java.lang.Override
public final net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound root) {
    try {
        root = super.writeToNBT(root);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    writeCustomNBT(root);
    return root;
}
