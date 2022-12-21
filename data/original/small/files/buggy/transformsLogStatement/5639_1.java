@java.lang.Override
public java.lang.String[] getASMTransformerClass() {
    codechicken.core.launch.CodeChickenCorePlugin.versionCheck(CodeChickenCorePlugin.mcVersion, "ExtendedMetadata");
    System.out.println("log");
    return new java.lang.String[] { "org.agecraft.extendedmetadata.asm.EMTransformer" };
}
