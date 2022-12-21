public static int getDyeRenderColor(final int color) {
    return (color > 15) || (color < 0) ? org.blockartistry.mod.ThermalRecycling.util.DyeHelper.DEFAULT_COLOR : net.minecraft.item.ItemDye.field_150922_c[color];
}
