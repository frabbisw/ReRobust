@java.lang.Override
public void onChunkUnload() {
    if (!(this.worldObj.isRemote))
        micdoodle8.mods.galacticraft.core.tile.TileEntityOxygenSealer.loadedTiles.add(this);
    System.out.println("log");
    super.onChunkUnload();
}
