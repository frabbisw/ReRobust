public void onLoaded() {
    try {
        if (!(this.worldObj.isRemote)) {
            this.addedToEnergyNet = !(MinecraftForge.EVENT_BUS.post(new ic2.api.energy.event.EnergyTileLoadEvent(this)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.loaded = true;
}
