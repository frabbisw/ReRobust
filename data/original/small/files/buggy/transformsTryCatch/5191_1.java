@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    try {
        super.writeToNBT(tagCompound);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    net.minecraft.nbt.NBTTagList itemList = new net.minecraft.nbt.NBTTagList();
    tagCompound.setTag("Inventory", itemList);
    tagCompound.setInteger("IonCount", force_lasers_ions);
}
