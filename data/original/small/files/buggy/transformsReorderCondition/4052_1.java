public float getFloatPropertyValue(java.lang.String property) {
    int i = getPropertyIndex(property);
    if (0 <= i) {
        return floatProperties[i];
    }
    return 0;
}
