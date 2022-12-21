public boolean canAcceptTraveller(com.elytradev.teckle.common.worldnetwork.WorldNetworkTraveller traveller, net.minecraft.util.EnumFacing from) {
    try {
        if (isLoaded()) {
            return getTile().canAcceptTraveller(traveller, from);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return isLoaded();
}
