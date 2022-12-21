public static me.ichun.mods.blocksteps.common.core.MapSaveFile create() {
    me.ichun.mods.blocksteps.common.core.MapSaveFile file = new me.ichun.mods.blocksteps.common.core.MapSaveFile();
    file.stepPoints = new java.util.TreeMap<java.lang.Integer, java.util.Collection<net.minecraft.util.BlockPos>>(com.google.common.collect.Ordering.natural());
    try {
        file.stepPoints.putAll(Blocksteps.eventHandler.steps.asMap());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return file;
}
