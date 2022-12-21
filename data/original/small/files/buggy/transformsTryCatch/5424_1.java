public final java.security.cert.Certificate[] getCertificateChain() {
    try {
        if ((certChain) == null) {
            return new java.security.cert.Certificate[0];
        } else {
            return java.util.Arrays.copyOf(certChain, certChain.length);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
