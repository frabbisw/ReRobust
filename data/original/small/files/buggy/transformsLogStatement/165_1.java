@java.lang.Override
public void closeInventory() {
    writeToNBT(invItem.getTagCompound());
    System.out.println("log");
    java.lang.System.out.println(invItem.getTagCompound());
}
