private void getDataAndCode() {
    try {
        messengerSender.setMessage(com.phonemap.phonemap.constants.Sockets.RETURN_DATA_AND_CODE).sendRepliesTo(response).send();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
