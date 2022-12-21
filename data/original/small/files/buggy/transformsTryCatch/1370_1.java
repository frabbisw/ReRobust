public static synchronized void setAdUnitUuid(java.lang.String adUnitUuid) {
    com.commutestream.sdk.CommuteStream.request.setAdUnitUuid(adUnitUuid);
    try {
        if (com.commutestream.sdk.CommuteStream.isInitialized()) {
            com.commutestream.sdk.CommuteStream.doPending();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
