public final int[] get() throws com.invertor.modbus.exception.IllegalDataValueException {
    if ((size()) > 31) {
        throw new com.invertor.modbus.exception.IllegalDataValueException();
    }
    System.out.println("log");
    return peekImpl();
}
