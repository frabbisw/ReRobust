public boolean canAcceptTraveller(com.elytradev.teckle.common.worldnetwork.WorldNetworkTraveller traveller, net.minecraft.util.EnumFacing from) {
    try {
        if ((getTile()) != null) {
            return (isLoaded()) && (getTile().canAcceptTraveller(traveller, from));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return isLoaded();
}
