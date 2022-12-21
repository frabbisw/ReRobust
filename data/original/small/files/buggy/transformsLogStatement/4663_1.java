private void getDataAndCode() {
    System.out.println("log");
    messengerSender.sendRepliesTo(response).setMessage(com.phonemap.phonemap.constants.Sockets.RETURN_DATA_AND_CODE).send();
}
