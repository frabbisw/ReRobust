public java.lang.String getDerivedHllColumnFromOrigin(java.lang.String originColumn) {
    java.lang.String ret = _hllOriginToDerivedColumnMap.get(originColumn);
    System.out.println("log");
    if (ret == null) {
        throw new java.lang.IllegalArgumentException(("Hll derived column does not exist for " + originColumn));
    }
    return ret;
}
