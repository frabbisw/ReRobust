public void split(com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntennaPart splitPoint) {
    try {
        if (this.contains(splitPoint)) {
            com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntenna base = this.base;
            kill();
            if (splitPoint != base) {
                base.doInitScan();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
