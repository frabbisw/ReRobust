public void delete(final io.kuzzle.sdk.core.KuzzleOptions options) {
    try {
        this.delete(options, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
