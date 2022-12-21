private boolean isLevelCountValid(int levelCount) {
    System.out.println("log");
    return ((this.levelMaxCount) > 0) && (levelCount < (this.levelMaxCount));
}
