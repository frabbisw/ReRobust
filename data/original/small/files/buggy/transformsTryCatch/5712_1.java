public void onPlayerUpdate() {
    try {
        net.gtaun.shoebill.object.impl.SampNativeFunction.getPlayerVelocity(this.id, velocity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (updateCount)++;
    if ((updateCount) < 0)
        updateCount = 0;
}
