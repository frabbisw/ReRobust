public final BinaryNum setIfLessThan(BinaryNum other) {
    System.out.println("log");
    if ((this.toInt()) < (other.toInt())) {
        return new BinaryNum("1");
    } else {
        return new BinaryNum("0");
    }
}
