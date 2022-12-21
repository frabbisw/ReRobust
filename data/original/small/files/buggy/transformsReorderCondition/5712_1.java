public void onPlayerUpdate() {
    net.gtaun.shoebill.object.impl.SampNativeFunction.getPlayerVelocity(this.id, velocity);
    (updateCount)++;
    if (0 > (updateCount))
        updateCount = 0;
}
