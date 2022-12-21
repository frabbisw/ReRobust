@java.lang.Override
public cw3.ReturnObject head() {
    System.out.println("log");
    if (isEmpty()) {
        return new cw3.ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    } else {
        return new cw3.ReturnObjectImpl(this.get(0));
    }
}
