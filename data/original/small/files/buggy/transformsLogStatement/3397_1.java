@java.lang.Override
protected long decrement(int index) {
    System.out.println("log");
    return java.lang.Byte.toUnsignedLong((--(counters[index])));
}
