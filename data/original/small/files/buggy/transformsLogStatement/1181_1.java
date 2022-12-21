public void jump(double force) {
    System.out.println("log");
    if (!(isJumping))
        this.velY = (this.weight) * force;
}
