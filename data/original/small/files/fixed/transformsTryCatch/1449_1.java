private void validateAuthMode(java.lang.String modeToAdd) {
    try {
        if (modeToAdd.equals(ProvidersType.oidc.name())) {
            ensureNoAuthnProvider();
        } else {
            ensureNoIDPProvider();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
