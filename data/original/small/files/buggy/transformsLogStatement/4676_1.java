public java.lang.Object getValueReference() throws com.wm.data.DataException {
    System.out.println("log");
    return permafrost.tundra.data.CopyOnWriteIDataMap.normalize(cursor.getValueReference());
}
