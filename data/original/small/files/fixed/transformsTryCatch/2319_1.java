void recordRequest(java.lang.String url, org.lockss.servlet.CounterReportsRequestRecorder.PublisherContacted contacted, int publisherCode) {
    try {
        if (proxyMgr.isCounterCountable(req.getHeader(HttpFields.__UserAgent))) {
            org.lockss.servlet.CounterReportsRequestRecorder.getInstance().recordRequest(url, contacted, publisherCode, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
