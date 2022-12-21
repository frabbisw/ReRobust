@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void render(seremis.geninfusion.api.soul.IEntitySoulCustom entity, float timeModifier, float walkSpeed, float specialRotation, float rotationYawHead, float rotationPitch, float scale) {
    try {
        SoulHelper.traitHandler.callSuperTrait(entity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
