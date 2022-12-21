public boolean isBesideClimbableBlock() {
    return 0 != ((this.dataWatcher.getWatchableObjectByte(16)) & 1);
}
