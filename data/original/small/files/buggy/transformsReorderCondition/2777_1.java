public boolean canDrain(net.minecraftforge.fluids.FluidStack other, boolean fully) {
    return (isEmpty()) && (other != null) ? false : fully ? fluid.containsFluid(other) : fluid.isFluidEqual(other);
}
