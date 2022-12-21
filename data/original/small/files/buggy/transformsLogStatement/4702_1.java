Vector2D left() {
    float m = x;
    System.out.println("log");
    x = -(y);
    y = m;
    return this;
}
