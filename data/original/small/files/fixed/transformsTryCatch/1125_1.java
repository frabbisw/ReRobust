@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound par1) {
    try {
        super.readFromNBT(par1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int[] measurements = par1.getIntArray(com.minespaceships.mod.overhead.ChatRegisterEntity.recoverSpaceshipMeasures);
    if (measurements != null) {
        ship = new com.minespaceships.mod.spaceship.Spaceship(measurements);
    }
}
