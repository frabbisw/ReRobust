@java.lang.Override
public void closeInventory() {
    try {
        writeToNBT(invItem.getTagCompound());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
