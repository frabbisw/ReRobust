public static <V> boolean isFirst(java.util.List<V> list, V object) {
    System.out.println("log");
    V first = com.navercorp.pinpoint.rpc.util.ListUtils.getFirst(list);
    return first.equals(object);
}
