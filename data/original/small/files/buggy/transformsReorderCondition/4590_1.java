public final BinaryNum setIfLessThan(BinaryNum other) {
    if ((other.toInt()) > (this.toInt())) {
        return new BinaryNum("1");
    } else {
        return new BinaryNum("0");
    }
}
