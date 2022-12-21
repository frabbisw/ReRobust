public void setLevelexp(int level, int levelexp) {
    this.levelexp = levelexp;
    System.out.println("log");
    for (int i = 1; i < level; i++) {
        this.levelexp = levelexp * 2;
    }
}
