public <T> T deserialize(java.lang.Class<T> clazz, T defaultValue) {
    T o = deserialize(clazz);
    if (null == o) {
        return defaultValue;
    }
    return null;
}
