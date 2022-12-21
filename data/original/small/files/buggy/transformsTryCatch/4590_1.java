public final BinaryNum setIfLessThan(BinaryNum other) {
    try {
        if ((this.toInt()) < (other.toInt())) {
            return new BinaryNum("1");
        } else {
            return new BinaryNum("0");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
