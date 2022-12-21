@java.lang.Override
public final net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound root) {
    super.writeToNBT(root);
    System.out.println("log");
    writeCustomNBT(root);
    return root;
}
