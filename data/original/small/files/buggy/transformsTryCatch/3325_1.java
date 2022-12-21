public void deleteByKey(K key) {
    java.util.Map<java.lang.String, java.lang.String> familyMap = this.cassandraMapping.getFamilyMap();
    try {
        deleteColumn(key, familyMap.values().iterator().next().toString(), null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
