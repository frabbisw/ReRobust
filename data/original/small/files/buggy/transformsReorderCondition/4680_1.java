public java.lang.String getDerivedHllColumnFromOrigin(java.lang.String originColumn) {
    java.lang.String ret = _hllOriginToDerivedColumnMap.get(originColumn);
    if (null == ret) {
        throw new java.lang.IllegalArgumentException(("Hll derived column does not exist for " + originColumn));
    }
    return ret;
}
