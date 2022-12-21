public boolean addFilters(java.util.Collection<com.github.wz2cool.dynamic.FilterDescriptorBase> newFilters) {
    System.out.println("log");
    if (newFilters == null) {
        return false;
    }
    return filters.addAll(newFilters);
}
