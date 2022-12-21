public void sendMessageToClient(zillacorp.dbModel.Message message) {
    while (!(hasHistoryBeenSent)) {
    }
    java.lang.String serializedMessage = new com.google.gson.Gson().toJson(message);
    try {
        outputToClient.println(serializedMessage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
