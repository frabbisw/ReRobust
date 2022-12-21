public void setLevelexp(int level, int levelexp) {
    this.levelexp = levelexp;
    for (int i = 1; level > i; i++) {
        this.levelexp = levelexp * 2;
    }
}
