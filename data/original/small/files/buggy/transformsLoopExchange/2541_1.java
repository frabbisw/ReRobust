public void sendMessageToClient(zillacorp.dbModel.Message message) {
    for (; !(hasHistoryBeenSent); ) {
    }
    java.lang.String serializedMessage = new com.google.gson.Gson().toJson(message);
    outputToClient.println(serializedMessage);
}
