public void jump(double force) {
    if (!(isJumping))
        this.velY = force * (this.weight);
}
