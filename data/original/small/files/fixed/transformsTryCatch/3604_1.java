public com.facebook.swift.codec.metadata.ThriftTypeReference getMapKeyThriftTypeReference(java.lang.reflect.Type javaType) {
    try {
        if (com.facebook.swift.codec.metadata.ThriftCatalog.isStructType(javaType)) {
            return getThriftTypeReference(javaType, com.facebook.swift.codec.metadata.ThriftCatalog.Recursiveness.FORCED);
        } else {
            return getThriftTypeReference(javaType, com.facebook.swift.codec.metadata.ThriftCatalog.Recursiveness.NOT_ALLOWED);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
