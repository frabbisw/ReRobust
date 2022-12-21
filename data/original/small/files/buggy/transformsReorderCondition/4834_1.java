public int up(int id) {
    final int w = this.width;
    return w > id ? id + (w * (this.height)) : id - w;
}
