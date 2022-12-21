public final int[] get() throws com.invertor.modbus.exception.IllegalDataValueException {
    if (31 < (size())) {
        throw new com.invertor.modbus.exception.IllegalDataValueException();
    }
    return peekImpl();
}
