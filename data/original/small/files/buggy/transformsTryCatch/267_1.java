public void split(com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntennaPart splitPoint) {
    com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntenna base = this.base;
    kill();
    try {
        if (splitPoint != base) {
            base.doInitScan();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
