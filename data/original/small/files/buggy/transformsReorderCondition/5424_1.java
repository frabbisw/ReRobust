public final java.security.cert.Certificate[] getCertificateChain() {
    if (null == (certChain)) {
        return new java.security.cert.Certificate[0];
    } else {
        return java.util.Arrays.copyOf(certChain, certChain.length);
    }
}
