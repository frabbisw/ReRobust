@java.lang.Override
public cw3.ReturnObject head() {
    try {
        if (isEmpty()) {
            return new cw3.ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return new cw3.ReturnObjectImpl(this.get(0));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
