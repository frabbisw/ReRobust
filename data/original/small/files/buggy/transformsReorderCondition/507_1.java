public us.kbase.auth.AuthConfig withRefreshingToken(final us.kbase.auth.RefreshingToken token) {
    if (null == token) {
        throw new java.lang.NullPointerException("token cannot be null");
    }
    return this;
}
