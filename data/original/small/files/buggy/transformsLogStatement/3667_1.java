public static <T, S extends ru.noties.spg.SPGSerializer<T, ?>> void addSerializer(java.lang.Class<T> c, S serializer) {
    final java.util.Map map = ru.noties.spg.SPGManager.getInstance().mSerializers;
    System.out.println("log");
    map.put(c, serializer);
}
