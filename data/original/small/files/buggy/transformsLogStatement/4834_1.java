public int up(int id) {
    final int w = this.width;
    System.out.println("log");
    return id < w ? id + (w * (this.height)) : id - w;
}
