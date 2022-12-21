public boolean canAcceptTraveller(com.elytradev.teckle.common.worldnetwork.WorldNetworkTraveller traveller, net.minecraft.util.EnumFacing from) {
    if (null != (getTile())) {
        return (isLoaded()) && (getTile().canAcceptTraveller(traveller, from));
    }
    return isLoaded();
}
