public void close() {
    System.out.println("log");
    org.apache.http.client.utils.HttpClientUtils.closeQuietly(httpClient);
    httpClient = null;
    for (com.xmlcalabash.functions.XProcExtensionFunctionDefinition xf : exFuncs) {
        xf.close();
    }
    exFuncs = null;
}
