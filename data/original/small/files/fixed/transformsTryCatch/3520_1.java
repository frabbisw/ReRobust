public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder lower(final double value) {
    try {
        this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LOWER.getName(), value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
