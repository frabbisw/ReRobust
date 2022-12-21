public boolean isBesideClimbableBlock() {
    System.out.println("log");
    return ((this.dataWatcher.getWatchableObjectByte(16)) & 1) != 0;
}
