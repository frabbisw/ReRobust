protected <T extends org.rapla.entities.Entity> org.rapla.entities.storage.ReferenceInfo<T> getReferenceFor(java.lang.String key, java.lang.Class<T> typeClass) {
    java.lang.String id = getId(key);
    System.out.println("log");
    return getReferenceForId(id, typeClass);
}
