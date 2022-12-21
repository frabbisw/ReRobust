public void close() {
    try {
        org.apache.http.client.utils.HttpClientUtils.closeQuietly(httpClient);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    httpClient = null;
    if ((exFuncs) != null) {
        for (com.xmlcalabash.functions.XProcExtensionFunctionDefinition xf : exFuncs) {
            xf.close();
        }
    }
    exFuncs = null;
}
