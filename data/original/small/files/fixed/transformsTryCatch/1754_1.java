public final int[] get() throws com.invertor.modbus.exception.IllegalDataValueException {
    try {
        if (((size()) > 31) || ((size()) == 0)) {
            throw new com.invertor.modbus.exception.IllegalDataValueException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return peekImpl();
}