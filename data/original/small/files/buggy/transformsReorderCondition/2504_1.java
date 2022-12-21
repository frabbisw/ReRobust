public boolean addFilters(java.util.Collection<com.github.wz2cool.dynamic.FilterDescriptorBase> newFilters) {
    if (null == newFilters) {
        return false;
    }
    return filters.addAll(newFilters);
}
