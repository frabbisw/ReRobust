private void getDataAndCode() {
    try {
        messengerSender.sendRepliesTo(response).setMessage(com.phonemap.phonemap.constants.Sockets.RETURN_DATA_AND_CODE).send();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
