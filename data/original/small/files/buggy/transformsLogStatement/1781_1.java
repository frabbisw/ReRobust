public byte getByte(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    System.out.println("log");
    return ret == null ? null : java.lang.Byte.parseByte(key);
}
