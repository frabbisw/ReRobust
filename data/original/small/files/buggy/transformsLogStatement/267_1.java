public void split(com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntennaPart splitPoint) {
    System.out.println("log");
    com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntenna base = this.base;
    kill();
    if (splitPoint != base) {
        base.doInitScan();
    }
}
