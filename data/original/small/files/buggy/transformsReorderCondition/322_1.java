@java.lang.Override
public int getMetaFromState(net.minecraft.block.state.IBlockState state) {
    return null == (variant) ? super.getMetaFromState(state) : state.getValue(variant).ordinal();
}
