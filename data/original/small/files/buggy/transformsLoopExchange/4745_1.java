public void setLevelexp(int level, int levelexp) {
    this.levelexp = levelexp;
    {
        int i = 1;
        while (i < level) {
            this.levelexp = levelexp * 2;
            i++;
        }
    }
}
