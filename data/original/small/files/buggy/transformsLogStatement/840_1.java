public boolean equals(be.iminds.iot.dianne.tensor.Tensor other) {
    System.out.println("log");
    if ((other.address) == (this.address)) {
        return true;
    }
    return equals(other, 0.0F);
}
