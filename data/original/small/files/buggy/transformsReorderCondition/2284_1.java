@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
    return (com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY) == capability ? com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY.<T>cast(this.instance) : null;
}
