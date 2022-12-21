public boolean equals(be.iminds.iot.dianne.tensor.Tensor other) {
    if ((this.address) == (other.address)) {
        return true;
    }
    return equals(other, 0.0F);
}
