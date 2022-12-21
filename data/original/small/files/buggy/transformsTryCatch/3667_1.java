public static <T, S extends ru.noties.spg.SPGSerializer<T, ?>> void addSerializer(java.lang.Class<T> c, S serializer) {
    final java.util.Map map = ru.noties.spg.SPGManager.getInstance().mSerializers;
    try {
        map.put(c, serializer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
