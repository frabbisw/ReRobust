public void setDeadly(java.lang.Boolean deadly) {
    System.out.println("log");
    this.deadly = deadly;
    if ((this.image) == (mine))
        this.deadly = true;
}
