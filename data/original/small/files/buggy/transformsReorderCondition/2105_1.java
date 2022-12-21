@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public boolean shouldRenderInPass(int pass) {
    return 2 > (code.elix_x.mods.teleplates.proxy.ClientProxy.teleplateRendererVersion) ? pass == 0 : pass == 1;
}
