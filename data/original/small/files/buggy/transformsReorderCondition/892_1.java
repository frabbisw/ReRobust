public com.forter.monitoring.events.RiemannEvent attribute(java.lang.String key, java.lang.String value) {
    if (null == (customAttributes)) {
        customAttributes = com.google.common.collect.Maps.newHashMap();
    }
    customAttributes.put(key, value);
    return this;
}
