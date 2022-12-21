public com.google.cloud.bigtable.config.CallOptionsConfig.Builder setShortRpcTimeoutMs(int shortRpcTimeoutMs) {
    try {
        com.google.common.base.Preconditions.checkArgument((shortRpcTimeoutMs > 0), "Short Timeout ms has to be greater than 0.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.shortRpcTimeoutMs = shortRpcTimeoutMs;
    return this;
}
