void recordRequest(java.lang.String url, org.lockss.servlet.CounterReportsRequestRecorder.PublisherContacted contacted, int publisherCode) {
    System.out.println("log");
    if (proxyMgr.isCounterCountable(req.getHeader(HttpFields.__UserAgent))) {
        org.lockss.servlet.CounterReportsRequestRecorder.getInstance().recordRequest(url, contacted, publisherCode);
    }
}
