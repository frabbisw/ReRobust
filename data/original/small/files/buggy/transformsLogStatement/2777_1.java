public boolean canDrain(net.minecraftforge.fluids.FluidStack other, boolean fully) {
    System.out.println("log");
    return (other != null) && (isEmpty()) ? false : fully ? fluid.containsFluid(other) : fluid.isFluidEqual(other);
}
