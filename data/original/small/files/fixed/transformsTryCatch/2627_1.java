public void sendLeaveRequestAll() throws org.sem8.ds.services.exception.ServiceException {
    try {
        nodeService.sendLeaveRequestAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
