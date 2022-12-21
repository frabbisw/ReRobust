public void setHostnameVerifier(javax.net.ssl.HostnameVerifier hostnameVerifier) {
    try {
        clientConfigBuilder.setHostnameVerifier(hostnameVerifier);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
