public void setDataRetriever(org.matrix.androidsdk.data.DataRetriever dataRetriever) {
    try {
        checkIfActive();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mDataRetriever = dataRetriever;
}
