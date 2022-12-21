public net.minecraft.util.EnumFacing getRotate() {
    if (rotate == 0) {
        return net.minecraft.util.EnumFacing.WEST;
    } else if (rotate == 1) {
        return net.minecraft.util.EnumFacing.NORTH;
    } else if (rotate == 2) {
        return net.minecraft.util.EnumFacing.EAST;
    } else {
        return net.minecraft.util.EnumFacing.SOUTH;
    }
}
