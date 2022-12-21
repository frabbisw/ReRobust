public java.lang.Object getValue() throws com.wm.data.DataException {
    System.out.println("log");
    return permafrost.tundra.data.CopyOnWriteIDataMap.normalize(cursor.getValue());
}
