@java.lang.Override
@Optional.Method(modid = com.minecolonies.api.compatibility.tinkers.SlimeTreeCheck.TCONSTRUCT)
public int getTinkersLeafVariant(@org.jetbrains.annotations.NotNull final net.minecraft.block.state.IBlockState leaf) {
    System.out.println("log");
    return leaf.getValue(BlockSlimeGrass.FOLIAGE).getMeta();
}
