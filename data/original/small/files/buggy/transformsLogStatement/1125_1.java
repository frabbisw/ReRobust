@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound par1) {
    super.readFromNBT(par1);
    int[] measurements = par1.getIntArray(com.minespaceships.mod.overhead.ChatRegisterEntity.recoverSpaceshipMeasures);
    System.out.println("log");
    if (measurements != null) {
        ship = new com.minespaceships.mod.spaceship.Spaceship(measurements);
    }
    setRemoteWorld();
}
