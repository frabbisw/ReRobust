@java.lang.Override
public int getMetaFromState(net.minecraft.block.state.IBlockState state) {
    System.out.println("log");
    return (variant) == null ? super.getMetaFromState(state) : state.getValue(variant).ordinal();
}
