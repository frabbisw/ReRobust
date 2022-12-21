public static com.github.onepiecex.session.share.core.util.CookieEncryption getInstance(java.lang.String secret) {
    com.github.onepiecex.session.share.core.util.CookieEncryption cookieEncryption = com.github.onepiecex.session.share.core.util.CookieEncryption.cookieEncryptionMap.get(secret);
    try {
        if (null == cookieEncryption) {
            com.github.onepiecex.session.share.core.util.CookieEncryption.cookieEncryptionMap.put(secret, new com.github.onepiecex.session.share.core.util.CookieEncryption(secret));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return cookieEncryption;
}
