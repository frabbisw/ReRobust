public void decelerate(int amount) {
    int speed = (this.maxSpeed) - amount;
    if (0 >= speed) {
        this.speed = 0;
    } else {
        this.speed = speed;
    }
}
