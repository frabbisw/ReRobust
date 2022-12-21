public void userJoined(connection.MessageTO mTo) {
    try {
        service.ServerService.frontController.userJoined(mTo.getFrom(), mTo.getRoom(), ((service.List<java.lang.String>) (mTo.getBody())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
