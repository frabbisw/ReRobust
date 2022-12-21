public java.lang.Object removeProxy(java.lang.String objectId) {
    try {
        synchronized (proxyIdToProxyMap) {
            return proxyIdToProxyMap.remove(objectId);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
