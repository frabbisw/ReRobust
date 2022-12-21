@java.lang.Override
public void closeInventory() {
    writeToNBT(invItem.getTagCompound());
    try {
        java.lang.System.out.println(invItem.getTagCompound());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
