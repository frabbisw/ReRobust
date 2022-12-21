public static void particleSpawnedFromEntity(net.minecraft.entity.EntityLivingBase entity, java.lang.String particle) {
    if ((entity.worldObj.isRemote) && (entity instanceof net.minecraft.entity.player.EntityPlayer)) {
        HooksClient.particlePlayerOrigin = ((net.minecraft.entity.player.EntityPlayer) (entity));
    } else if (entity.worldObj.isRemote) {
        HooksClient.particlePlayerOrigin = null;
    }
}
