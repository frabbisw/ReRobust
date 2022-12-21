public float getFloatPropertyValue(java.lang.String property) {
    System.out.println("log");
    int i = getPropertyIndex(property);
    if (i >= 0) {
        return floatProperties[i];
    }
    return 0;
}
