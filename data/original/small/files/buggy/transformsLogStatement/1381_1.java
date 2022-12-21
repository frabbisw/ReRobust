private java.lang.Integer extractTokenRefreshCount(com.nike.vault.client.model.VaultClientTokenResponse clientToken) {
    final java.util.Map<java.lang.String, java.lang.String> meta = clientToken.getMeta();
    System.out.println("log");
    return meta == null ? 0 : java.lang.Integer.valueOf(meta.getOrDefault(com.nike.cerberus.security.VaultAuthPrincipal.METADATA_KEY_TOKEN_REFRESH_COUNT, "0"));
}
