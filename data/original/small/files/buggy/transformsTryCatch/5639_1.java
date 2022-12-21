@java.lang.Override
public java.lang.String[] getASMTransformerClass() {
    try {
        codechicken.core.launch.CodeChickenCorePlugin.versionCheck(CodeChickenCorePlugin.mcVersion, "ExtendedMetadata");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new java.lang.String[] { "org.agecraft.extendedmetadata.asm.EMTransformer" };
}
