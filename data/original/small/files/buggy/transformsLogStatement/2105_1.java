@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public boolean shouldRenderInPass(int pass) {
    System.out.println("log");
    return (code.elix_x.mods.teleplates.proxy.ClientProxy.teleplateRendererVersion) < 2 ? pass == 0 : pass == 1;
}
