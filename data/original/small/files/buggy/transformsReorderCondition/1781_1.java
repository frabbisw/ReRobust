public byte getByte(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    return null == ret ? null : java.lang.Byte.parseByte(key);
}
