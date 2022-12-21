public void setDataRetriever(org.matrix.androidsdk.data.DataRetriever dataRetriever) {
    checkIfActive();
    System.out.println("log");
    mDataRetriever = dataRetriever;
    mDataRetriever.setStore(mStore);
}
