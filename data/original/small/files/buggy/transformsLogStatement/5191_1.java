@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.writeToNBT(tagCompound);
    net.minecraft.nbt.NBTTagList itemList = new net.minecraft.nbt.NBTTagList();
    tagCompound.setTag("Inventory", itemList);
    System.out.println("log");
    tagCompound.setInteger("IonCount", force_lasers_ions);
}
