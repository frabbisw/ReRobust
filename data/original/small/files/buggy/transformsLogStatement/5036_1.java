public <T> T deserialize(java.lang.Class<T> clazz, T defaultValue) {
    T o = deserialize(clazz);
    System.out.println("log");
    if (o == null) {
        return defaultValue;
    }
    return null;
}
