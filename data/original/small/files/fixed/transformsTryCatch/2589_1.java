public static com.github.onepiecex.session.share.core.util.CookieEncryption getInstance(java.lang.String secret) {
    com.github.onepiecex.session.share.core.util.CookieEncryption cookieEncryption = com.github.onepiecex.session.share.core.util.CookieEncryption.cookieEncryptionMap.get(secret);
    try {
        if (null == cookieEncryption) {
            cookieEncryption = new com.github.onepiecex.session.share.core.util.CookieEncryption(secret);
            com.github.onepiecex.session.share.core.util.CookieEncryption.cookieEncryptionMap.put(secret, cookieEncryption);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return cookieEncryption;
}
